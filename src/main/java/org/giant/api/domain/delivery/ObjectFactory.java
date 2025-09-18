package org.giant.api.domain.delivery;

import lombok.NoArgsConstructor;
import org.giant.api.domain.delivery.cj.zip.model.request.GetAddressInformationByValue;
import org.giant.api.domain.delivery.cj.zip.model.response.GetAddressInformationByValueResponse;
import org.giant.api.domain.delivery.logen.number.model.LogenNumberRequest;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderRequest;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceRequest;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeRequest;
import org.giant.api.domain.delivery.logen.number.model.LogenNumberResponse;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderResponse;
import org.giant.api.domain.delivery.logen.trace.model.LogenTraceResponse;
import org.giant.api.domain.delivery.logen.zip.model.LogenZipCodeResponse;

import jakarta.xml.bind.annotation.*;

/**
 * JABX 파싱을 위해 model 등록해줘야 함
 */
@XmlRegistry
@NoArgsConstructor
public class ObjectFactory {
    public LogenNumberRequest logenNumberRequest() {
        return new LogenNumberRequest();
    }

    public LogenNumberResponse logenNumberResponse() {
        return new LogenNumberResponse();
    }

    public LogenZipCodeRequest logenZipCodeRequest() {
        return new LogenZipCodeRequest();
    }

    public LogenZipCodeResponse logenZipCodeResponse() {
        return new LogenZipCodeResponse();
    }

    public LogenTraceRequest logenTraceRequest() {
        return new LogenTraceRequest();
    }

    public LogenTraceResponse logenTraceResponse() {
        return new LogenTraceResponse();
    }

    public LogenOrderRequest logenOrderRequest() {
        return new LogenOrderRequest();
    }

    public LogenOrderResponse logenOrderResponse() {
        return new LogenOrderResponse();
    }

    public GetAddressInformationByValue  getAddressInformationByValue() {
        return new GetAddressInformationByValue();
    }

    public GetAddressInformationByValueResponse getAddressInformationByValueResponse() {
        return new GetAddressInformationByValueResponse();
    }
}
