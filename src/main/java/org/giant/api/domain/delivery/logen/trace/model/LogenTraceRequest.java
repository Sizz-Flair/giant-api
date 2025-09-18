package org.giant.api.domain.delivery.logen.trace.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.*;

@NoArgsConstructor
@XmlRootElement(
    name = "W_PHP_NTx_Get_Trace",
    namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LogenTraceRequest {
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService")
    private String userID;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService")
    private String passWord;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService")
    private String slipNo;

    @Builder
    private LogenTraceRequest(String userID, String passWord, String slipNo) {
        this.userID = userID;
        this.passWord = passWord;
        this.slipNo = slipNo;
    }
}
