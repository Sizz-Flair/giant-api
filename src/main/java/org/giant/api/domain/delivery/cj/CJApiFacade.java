package org.giant.api.domain.delivery.cj;

import lombok.RequiredArgsConstructor;
import org.giant.api.domain.delivery.cj.zip.model.response.AddressInfo;
import org.giant.api.domain.delivery.logen.zip.LogenZipCodeDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * CJApiFacade 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@Service
@RequiredArgsConstructor
public class CJApiFacade {
    private final BaseCJSoapService baseCJSoapService;

    public Optional<AddressInfo> callZipCode(String orderNo, String address) {
        return baseCJSoapService.callSoap(orderNo, address);
    }
}
