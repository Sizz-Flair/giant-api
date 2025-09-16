package org.giant.api.config;

import org.giant.api.domain.delivery.logen.number.model.LogenNumberRequest;
import org.giant.api.domain.delivery.logen.number.model.LogenNumberResponse;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderRequest;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderResponse;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceRequest;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceResponse;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeRequest;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Spring Bean 자동 주입 매개 클래스
 */
@Configuration
@ComponentScan(basePackages = "org.giant.api")
public class ApiAutoConfig {

    /**
     * JABX 파싱 클래스 셋업
     * 마샬, 언마샬 해당 클래스 정보데이터 기반으로 진행
     */
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        marshaller.setClassesToBeBound(
//                LogenNumberRequest.class,
//                LogenNumberResponse.class,
//                LogenZipCodeRequest.class,
//                LogenZipCodeResponse.class,
//                LogenTraceRequest.class,
//                LogenTraceResponse.class,
//                LogenOrderRequest.class,
//                LogenOrderResponse.class
//        );
        marshaller.setPackagesToScan("org.giant.api.domain");

        return marshaller;
    }

    /**
     * @param marshaller
     * JABX 템플릿 파싱 언파싱 셋업
     */
    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate template = new WebServiceTemplate();
        template.setMarshaller(marshaller);
        template.setUnmarshaller(marshaller);

        return template;
    }
}
