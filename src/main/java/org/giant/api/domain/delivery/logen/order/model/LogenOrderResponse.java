package org.giant.api.domain.delivery.logen.order.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
