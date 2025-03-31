package org.giant.api.domain.delivery.logen.order.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@XmlRootElement(
    name = "W_PHP_Tx_Order_SaveResponse",
    namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService"
)
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class LogenOrderResponse {
    @XmlElement(name = "W_PHP_Tx_Order_SaveResult", namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String result;
}
