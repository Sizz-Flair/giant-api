package org.giant.api.domain.delivery.logen.trace.service;

import org.giant.api.domain.delivery.logen.BaseLogenSoapService;
import org.giant.api.domain.delivery.logen.trace.LogenTraceDto;
import org.giant.api.domain.delivery.logen.LogenUserInfoDto;
import org.giant.api.domain.delivery.logen.enums.LogenSeparation;
import org.giant.api.domain.delivery.logen.enums.LogenSoap;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceRequest;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Logen 트랙킹
 */
@Component
public class LogenTraceService extends BaseLogenSoapService {
    public LogenTraceService(WebServiceTemplate webServiceTemplate) {
        super(webServiceTemplate);
    }

    public List<LogenTraceDto> getTrace(final LogenUserInfoDto info, String number) {
        assertLogenInfo(info);
        Assert.notNull(number, "");

        LogenTraceRequest request = setRequest(info, number);

        LogenTraceResponse response =
                callSoap(LogenSoap.TRACE.url(), request, LogenSoap.TRACE.action(), LogenTraceResponse.class);

        checkResponseData(response.getResult());

        String trace = response.getResult();

        if(checkEmpty(trace)) {
            return Collections.emptyList();
        }

        return Collections.unmodifiableList(convertToTraceList(trace));
    }

    private LogenTraceRequest setRequest(LogenUserInfoDto info, String number) {
        return LogenTraceRequest
                .builder()
                .userID(info.getUserId())
                .passWord(info.getPassWord())
                .slipNo(number)
                .build();
    }

    public List<LogenTraceDto> convertToTraceList(String traceInfo) {
        return Arrays.stream(traceInfo.split(LogenSeparation.S2.get()))
                .map(this::mapToTraceDto)
                .filter( e -> !e.getSlipNo().equals(LogenSeparation.S3.get()))
                .collect(Collectors.toList());
    }

    private LogenTraceDto mapToTraceDto(String record) {
        String[] split = record.split(LogenSeparation.S1.get(), -1); // 빈 값 포함

        return LogenTraceDto.builder()
                .slipNo(get(split, 0))
                .scanDate(get(split, 1))
                .scanTime(get(split, 2))
                .cargoStatus(get(split, 3))
                .branchCode(get(split, 4))
                .branchName(get(split, 5))
                .agencyCode(get(split, 6))
                .agencyName(get(split, 7))
                .departure(get(split, 8))
                .arrival(get(split, 9))
                .receiverType(get(split, 10))
                .build();
    }

    private String get(String[] arr, int idx) {
        return (idx < arr.length) ? arr[idx] : "";
    }

    private boolean checkEmpty(String traceInfo) {
        return traceInfo.equals(LogenSeparation.S3.get());
    }
}
