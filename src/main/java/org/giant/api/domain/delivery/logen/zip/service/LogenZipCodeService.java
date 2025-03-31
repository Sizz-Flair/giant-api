package org.giant.api.domain.delivery.logen.zip.service;

import org.giant.api.domain.delivery.logen.BaseLogenSoapService;
import org.giant.api.domain.delivery.logen.LogenUserInfoDto;
import org.giant.api.domain.delivery.logen.enums.LogenSeparation;
import org.giant.api.domain.delivery.logen.enums.LogenSoap;
import org.giant.api.domain.delivery.logen.zip.LogenZipCodeDto;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeRequest;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;

/**
 * Logen 송장정보
 */
@Component
public class LogenZipCodeService extends BaseLogenSoapService {

    public LogenZipCodeService(WebServiceTemplate webServiceTemplate) {
        super(webServiceTemplate);
    }

    public LogenZipCodeDto getZipCode(final LogenUserInfoDto info, final String address) {
        assertLogenInfo(info);
        Assert.notNull(address, "");

        LogenZipCodeRequest request = setRequest(info, address);

        LogenZipCodeResponse response =
                callSoap(LogenSoap.ZIPCODE.url(), request, LogenSoap.ZIPCODE.action(), LogenZipCodeResponse.class);

        checkResponseData(response.getResult());

        String zipCode = response.getResult();

        if(checkEmpty(zipCode)) {
            throw new IllegalStateException("로젠 배송지 정보가 존재하지 않습니다");
        }

        return convertToDto(splitResponseData(zipCode, LogenSeparation.S1.get()));
    }

    private boolean checkEmpty(String zipCode) {
        return zipCode.equals("Ξ≡〓");
    }

    private LogenZipCodeRequest setRequest(LogenUserInfoDto info, String address) {
        return LogenZipCodeRequest
                .builder()
                .fixCustCd(info.getUserId())
                .userID(info.getUserId())
                .strAddr(address)
                .build();
    }

    private LogenZipCodeDto convertToDto(final List<String> codeList) {
        return LogenZipCodeDto.builder()
                .deliveryZone(codeList.get(0))
                .townName(codeList.get(1))
                .arrivalCode(codeList.get(2))
                .zipCode(codeList.get(3))
                .isJeju(codeList.get(4))
                .isMarine(codeList.get(5))
                .isMountain(codeList.get(6))
                .agencyName(codeList.get(7))
                .isInArea(codeList.get(8))
                .terminalName(codeList.get(9))
                .build();
    }
}
