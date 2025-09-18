package org.giant.api.domain.delivery.logen.zip.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.*;

@NoArgsConstructor
@XmlRootElement(name = "W_PHP_NTx_Get_NewSlip_SelectResponse", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class LogenZipCodeResponse {
    @XmlElement(name = "W_PHP_NTx_Get_NewSlip_SelectResult", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/")
    private String result;
}
