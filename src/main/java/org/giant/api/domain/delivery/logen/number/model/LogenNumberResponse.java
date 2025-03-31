package org.giant.api.domain.delivery.logen.number.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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
