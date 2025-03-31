package org.giant.api.domain.delivery.logen;

import lombok.RequiredArgsConstructor;
import org.giant.api.domain.delivery.logen.number.service.LogenNumberService;
import org.giant.api.domain.delivery.logen.order.LogenOrderDto;
import org.giant.api.domain.delivery.logen.order.service.LogenOrderService;
import org.giant.api.domain.delivery.logen.trace.LogenTraceDto;
import org.giant.api.domain.delivery.logen.trace.service.LogenTraceService;
import org.giant.api.domain.delivery.logen.zip.LogenZipCodeDto;
import org.giant.api.domain.delivery.logen.zip.service.LogenZipCodeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LogenApiFacade {

    private final LogenNumberService logenSlipNoService;
    private final LogenZipCodeService logenZipCodeService;
    private final LogenTraceService logenTraceService;
    private final LogenOrderService logenOrderService;

    /**
     * @param info logen에서 제공한 유저 코드, 암호
     * @param qty 발급받을 송장 갯수
     * @return 송장 list
     */
    public List<String> callNumberList(final LogenUserInfoDto info, int qty) {
        return logenSlipNoService.getNumberList(info, qty);
    }

    /**
     * @param info logen에서 제공한 유저 코드, 암호
     * @param address 해당 주소의 zip code
     * @return LogenZipCodeDto
     */
    public LogenZipCodeDto callZipCode(final LogenUserInfoDto info, final String address) {
        return logenZipCodeService.getZipCode(info, address);
    }

    /**
     * @param info logen에서 제공한 유저 코드, 암호
     * @param number 트랙킹할 송장 번호
     * @return LogenTraceDto
     */
    public List<LogenTraceDto> callTrace(final LogenUserInfoDto info, final String number) {
        return logenTraceService.getTrace(info, number);
    }

    /**
     * @param info logen에서 제공한 유저 코드, 암호
     * @param dto 로젠접수정보 dto
     * @return 로젠 응답값이 TRUE, FAIL
     */
    public boolean callOrder(final LogenUserInfoDto info, final LogenOrderDto dto) {
        return logenOrderService.sendOrder(info, dto);
    }
}
