package org.giant.api.domain.delivery.cj.zip.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * AddressReuqest 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
        "boxTyp", "clntMgmCustCd", "clntNum", "cntrLarcCd",
        "fareDiv", "orderNo", "prngDivCd", "rcvrAddr", "sndprsnAddr"
})
public class AddressRequest {
    private String boxTyp;
    private String clntMgmCustCd;
    private String clntNum;
    private String cntrLarcCd;
    private String fareDiv;
    private String orderNo;
    private String prngDivCd;
    private String rcvrAddr;
    private String sndprsnAddr;

    public AddressRequest() {}

    public AddressRequest(String orderNo, String rcvrAddr) {
        this.boxTyp = "1";
        this.clntMgmCustCd = "30327633";
        this.clntNum = "30327633";
        this.cntrLarcCd = "01";
        this.fareDiv = "03";
        this.orderNo = orderNo;
        this.prngDivCd = "01";
        this.rcvrAddr = rcvrAddr;
        this.sndprsnAddr = "인천광역시 중구 제물량로 197";
    }
}