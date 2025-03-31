package org.giant.api.domain.delivery.logen.trace.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@XmlRootElement(
        name = "W_PHP_NTx_Get_TraceResponse",
        namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class LogenTraceResponse {
    @XmlElement(name = "W_PHP_NTx_Get_TraceResult", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService")
    private String result;

    @Builder
    public LogenTraceResponse(String result) {
        this.result = result;
    }
}
