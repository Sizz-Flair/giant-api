package org.giant.api.domain.delivery.logen.zip.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.*;

@NoArgsConstructor
@XmlRootElement(
    name = "W_PHP_NTx_Get_NewSlip_Select",
    namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LogenZipCodeRequest {
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/")
    private String fixCustCd;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/")
    private String userID;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/")
    private String strAddr;

    @Builder
    private LogenZipCodeRequest(String fixCustCd, String userID, String strAddr) {
        this.fixCustCd = fixCustCd;
        this.userID = userID;
        this.strAddr = strAddr;
    }
}
