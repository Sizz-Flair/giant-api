package org.giant.api.domain.delivery.logen.number.service;

import org.giant.api.domain.delivery.logen.BaseLogenSoapService;
import org.giant.api.domain.delivery.logen.LogenUserInfoDto;
import org.giant.api.domain.delivery.logen.enums.LogenSeparation;
import org.giant.api.domain.delivery.logen.enums.LogenSoap;
import org.giant.api.domain.delivery.logen.number.model.LogenNumberRequest;
import org.giant.api.domain.delivery.logen.number.model.LogenNumberResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;

/**
 * 로젠 송장번호 채번
 */
@Component
public class LogenNumberService extends BaseLogenSoapService {

    public LogenNumberService(WebServiceTemplate webServiceTemplate) {
        super(webServiceTemplate);
    }

    /**
     * @param info logen에서 제공한 유저 코드, 암호
     * @param qty 발급받을 송장 갯수
     * @return 송장 list
     */
    public List<String> getNumberList(final LogenUserInfoDto info, int qty) {
        assertLogenInfo(info);

        LogenNumberRequest request = setRequest(info, qty);

        LogenNumberResponse response =
                callSoap(LogenSoap.NUMBER.url(), request, LogenSoap.NUMBER.action(), LogenNumberResponse.class);

        checkResponseData(response.getResult());

        String slipNo = response.getResult();

        return splitResponseData(slipNo, LogenSeparation.S1.get());
    }

    private LogenNumberRequest setRequest(LogenUserInfoDto info, int qty) {
        return LogenNumberRequest
                .builder()
                .userID(info.getUserId())
                .passWord(info.getPassWord())
                .slipQty(qty)
                .build();
    }
}
