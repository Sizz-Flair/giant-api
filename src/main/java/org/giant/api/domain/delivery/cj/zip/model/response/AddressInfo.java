package org.giant.api.domain.delivery.cj.zip.model.response;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * AddressInfo 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressInfo {
    private String boxTyp;
    private String bscFare;
    private String clntMgmCustCd;
    private String clntNum;
    private String cntrLarcCd;
    private String dealFare;
    private String dlvClsfCd;
    private String dlvClsfNm;
    private String dlvPreArrBranCd;
    private String dlvPreArrBranNm;
    private String dlvPreArrBranShortNm;
    private String dlvPreArrEmpNickNm;
    private String dlvPreArrEmpNm;
    private String dlvPreArrEmpNum;
    private String dlvSubClsfCd;
    private String errorCd;
    private String errorMsg;
    private String fareDiv;
    private String ferryFare;
    private String gthClsfCd;
    private String gthClsfNm;
    private String gthPreArrBranCd;
    private String gthPreArrBranNm;
    private String gthPreArrBranShortNm;
    private String gthPreArrEmpNickNm;
    private String gthPreArrEmpNm;
    private String gthPreArrEmpNum;
    private String gthSubClsfCd;
    private String jejuFare;
    private String orderNo;
    private String prngDivCd;
    private String rcvrAddr;
    private String rcvrClsfAddr;
    private String rcvrEtcAddr;
    private String rcvrNewAddr;
    private String rcvrNewAddrDtl;
    private String rcvrNewAddrYn;
    private String rcvrOldAddr;
    private String rcvrOldAddrDtl;
    private String rcvrShortAddr;
    private String rcvrZipnum;
    private String sndprClsfAddr;
    private String sndprEtcAddr;
    private String sndprNewAddr;
    private String sndprNewAddrDtl;
    private String sndprNewAddrYn;
    private String sndprOldAddr;
    private String sndprOldAddrDtl;
    private String sndprShortAddr;
    private String sndprZipnum;
    private String sndprsnAddr;

    // Getter/Setter 모두 추가
}
