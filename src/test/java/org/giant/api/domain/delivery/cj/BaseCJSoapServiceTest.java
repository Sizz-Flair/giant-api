package org.giant.api.domain.delivery.cj;

import org.giant.api.domain.delivery.cj.zip.model.response.AddressInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * BaseCJSoapServiceTest 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@SpringBootTest
class BaseCJSoapServiceTest {

    @Autowired
    private CJApiFacade cjApiFacade;


    @Test
    void test() {
        AddressInfo orer = cjApiFacade.callZipCode("orer", "인천광역시 부평구 안남로 15번길 24").get();

        System.out.println(orer.toString());
    }
}