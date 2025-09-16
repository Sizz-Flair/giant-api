package org.giant.api.domain.delivery.cj;

import lombok.RequiredArgsConstructor;
import org.giant.api.domain.delivery.cj.zip.model.request.AddressRequest;
import org.giant.api.domain.delivery.cj.zip.model.request.GetAddressInformationByValue;
import org.giant.api.domain.delivery.cj.zip.model.response.AddressInfo;
import org.giant.api.domain.delivery.cj.zip.model.response.GetAddressInformationByValueResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Optional;

/**
 * BaseCJSoapService 클래스
 *
 * <p>설명: TODO 메소드 자체는 soap 호출하는 내용임, 지금 작성 내용은 주소 zip코드 불러오기 용으로 쓰이고있음
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@Service
@RequiredArgsConstructor
public class BaseCJSoapService {
    private final WebServiceTemplate webServiceTemplate;

    protected Optional<AddressInfo> callSoap(final String orderNo, final String address) {
        AddressRequest request = new AddressRequest(orderNo, address);
        GetAddressInformationByValue payload = new GetAddressInformationByValue(request);

        GetAddressInformationByValueResponse response =
                (GetAddressInformationByValueResponse) webServiceTemplate.marshalSendAndReceive(
                        "https://address.doortodoor.co.kr/address/address_webservice.korex",
                        payload
                );

        return Optional.of(response.getAddressInfo());
    }
}
