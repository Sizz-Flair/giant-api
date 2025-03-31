package org.giant.api.domain.delivery.logen.order.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@XmlRootElement(
    name = "W_PHP_Tx_Order_Save",
    namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LogenOrderRequest {
    /** 사용자 아이디 (솔루션업체 계약 코드) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String userID;

    /** 사용자 비밀번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String passWord;

    /** 출력 여부 (Y/N) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String printYn;

    /** 송장번호 (11자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String slipNo;

    /** 거래처 코드 (업체 계약 코드) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String fixCustCd;

    /** 송하인명 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndCustNm;

    /** 송하인 전화번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndTelNo;

    /** 송하인 휴대폰 번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndHandNo;

    /** 송하인 우편번호 (6자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndZipCd;

    /** 송하인 우편일련번호 (3자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndZipSeq;

    /** 송하인 주소 1 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndCustAddr1;

    /** 송하인 주소 2 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String sndCustAddr2;

    /** 수하인명 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvCustNm;

    /** 수하인 전화번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvTelNo;

    /** 수하인 휴대폰 번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvHandNo;

    /** 수하인 우편번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvZipCd;

    /** 수하인 우편일련번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvZipSeq;

    /** 수하인 주소 1 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvCustAddr1;

    /** 수하인 주소 2 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvCustAddr2;

    /** 운임 구분 (010: 선불, 020: 착불, 030: 신용, 040: 본사신용) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String freightType;

    /** 박스 수량 (고정값 1) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String qty;

    /** 배송지 코드 (도착점 코드 3자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String rcvBranCd;

    /** 상품명 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String goodsNm;

    /** 택배 운임 (숫자 7자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String priceAmt;

    /** 할증 운임 (숫자 9자리) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String extraAmt;

    /** 상품 금액 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String goodsAmt;

    /** 제주 운임 구분 (010/020/030/040) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String airAmtType;

    /** 해운 운임 구분 (010: 선불 or 공백) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String shipAmtYn;

    /** 접수일자 (yyyyMMdd) */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String takeDt;

    /** 비고 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String remarks;

    /** 접수번호 */
    @XmlElement(namespace = "http://ilogen.ilogen.com/iLOGEN.EDI_PHP_SAVE.WebService")
    private String fixTakeNo;

    @Builder
    public LogenOrderRequest(String userID, String passWord, String printYn, String slipNo, String fixCustCd, String sndCustNm, String sndTelNo, String sndHandNo, String sndZipCd, String sndZipSeq, String sndCustAddr1, String sndCustAddr2, String rcvCustNm, String rcvTelNo, String rcvHandNo, String rcvZipCd, String rcvZipSeq, String rcvCustAddr1, String rcvCustAddr2, String freightType, String qty, String rcvBranCd, String goodsNm, String priceAmt, String extraAmt, String goodsAmt, String airAmtType, String shipAmtYn, String takeDt, String remarks, String fixTakeNo) {
        this.userID = userID;
        this.passWord = passWord;
        this.printYn = printYn;
        this.slipNo = slipNo;
        this.fixCustCd = fixCustCd;
        this.sndCustNm = sndCustNm;
        this.sndTelNo = sndTelNo;
        this.sndHandNo = sndHandNo;
        this.sndZipCd = sndZipCd;
        this.sndZipSeq = sndZipSeq;
        this.sndCustAddr1 = sndCustAddr1;
        this.sndCustAddr2 = sndCustAddr2;
        this.rcvCustNm = rcvCustNm;
        this.rcvTelNo = rcvTelNo;
        this.rcvHandNo = rcvHandNo;
        this.rcvZipCd = rcvZipCd;
        this.rcvZipSeq = rcvZipSeq;
        this.rcvCustAddr1 = rcvCustAddr1;
        this.rcvCustAddr2 = rcvCustAddr2;
        this.freightType = freightType;
        this.qty = qty;
        this.rcvBranCd = rcvBranCd;
        this.goodsNm = goodsNm;
        this.priceAmt = priceAmt;
        this.extraAmt = extraAmt;
        this.goodsAmt = goodsAmt;
        this.airAmtType = airAmtType;
        this.shipAmtYn = shipAmtYn;
        this.takeDt = takeDt;
        this.remarks = remarks;
        this.fixTakeNo = fixTakeNo;
    }
}
