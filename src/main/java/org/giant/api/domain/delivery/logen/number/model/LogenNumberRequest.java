package org.giant.api.domain.delivery.logen.number.model;

import jakarta.xml.bind.annotation.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Logen 송장 채번 모델
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "userID", "passWord", "slipQty"
})
@XmlRootElement(
    name = "W_PHP_Tx_Get_SlipNo",
    namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
@NoArgsConstructor
public class LogenNumberRequest {

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String userID;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String passWord;

    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private int slipQty;

    @Builder
    private LogenNumberRequest(String userID, String passWord, int slipQty) {
        this.userID = userID;
        this.passWord = passWord;
        this.slipQty = slipQty;
    }
}
