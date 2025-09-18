package org.giant.api.domain.delivery.logen.number.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
/**
 * Logen 송장채번 응답 모델
 */
@XmlRootElement(name = "W_PHP_Tx_Get_SlipNoResponse", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
public class LogenNumberResponse {
    @XmlElement(name = "W_PHP_Tx_Get_SlipNoResult", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String result;
}
