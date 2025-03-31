package org.giant.api.domain.delivery.logen.enums;


/**
 * Logen Soap url, action 열거형
 */
public enum LogenSoap {
    NUMBER("http://ediweb.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService/W_PHPServer.asmx",
            "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService/W_PHP_Tx_Get_SlipNo"),
    ZIPCODE("http://ediweb.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/W_PHPServer.asmx",
            "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_DIVCD.WebService/W_PHP_NTx_Get_NewSlip_Select"),
    TRACE("http://ediweb.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService/W_PHPServer.asmx",
            "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_TRACKING.WebService/W_PHP_NTx_Get_Trace"),
    ORDER("http://ediweb.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService/W_PHPServer.asmx",
            "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService/W_PHP_Tx_Order_Save");

    private String url;
    private String action;

    LogenSoap(String url, String action) {
        this.url = url;
        this.action = action;
    }

    public String url() {
        return url;
    }

    public String action() {
        return action;
    }
}
