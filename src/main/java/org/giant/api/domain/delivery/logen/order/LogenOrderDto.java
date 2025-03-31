package org.giant.api.domain.delivery.logen.order;


import lombok.Builder;
import lombok.Getter;

@Getter
public class LogenOrderDto {
    /** 사용자 아이디 (8자리, 솔루션 업체 계약 코드) */
    private String userID;

    /** 사용자 비밀번호 */
    private String passWord;

    /** 출력 여부 (Y/N) */
    private String printYn;

    /** 송장번호 (11자리) */
    private String slipNo;

    /** 거래처 코드 (업체 계약 코드) */
    private String fixCustCd;

    /** 송하인명 (최대 50자) */
    private String sndCustNm;

    /** 송하인 전화번호 (최대 16자) */
    private String sndTelNo;

    /** 송하인 휴대폰 번호 (최대 16자) */
    private String sndHandNo;

    /** 송하인 우편번호 (6자리) */
    private String sndZipCd;

    /** 송하인 우편일련번호 (3자리) */
    private String sndZipSeq;

    /** 송하인 주소 1 (예: 서울 용산구 한강로3가) */
    private String sndCustAddr1;

    /** 송하인 주소 2 (예: 삼구빌딩) */
    private String sndCustAddr2;

    /** 수하인명 (최대 50자) */
    private String rcvCustNm;

    /** 수하인 전화번호 (최대 16자) */
    private String rcvTelNo;

    /** 수하인 휴대폰 번호 (최대 16자) */
    private String rcvHandNo;

    /** 수하인 우편번호 (6자리) */
    private String rcvZipCd;

    /** 수하인 우편일련번호 (3자리) */
    private String rcvZipSeq;

    /** 수하인 주소 1 (예: 서울 서초구 서초동) */
    private String rcvCustAddr1;

    /** 수하인 주소 2 (예: 삼익빌라 xxx호) */
    private String rcvCustAddr2;

    /** 운임 구분 (010: 선불, 020: 착불, 030: 신용, 040: 본사신용) */
    private String freightType;

    /** 박스 수량 (기본값 1) */
    private String qty;

    /** 배송지 코드 (도착점 코드 3자리) */
    private String rcvBranCd;

    /** 상품명 (최대 2000자) */
    private String goodsNm;

    /** 택배 운임 (예: 3000) */
    private String priceAmt;

    /** 할증 운임 (예: 500) */
    private String extraAmt;

    /** 상품 금액 */
    private String goodsAmt;

    /** 제주 운임 구분 (항공 운임 발생 시 운임 구분과 동일) */
    private String airAmtType;

    /** 해운 운임 구분 (010: 선불 or 공백. 착불이면 발송 불가) */
    private String shipAmtYn;

    /** 접수 일자 (yyyyMMdd) */
    private String takeDt;

    /** 비고 (최대 1000자) */
    private String remarks;

    /** 접수번호 */
    private String fixTakeNo;

    @Builder
    public LogenOrderDto(String userID, String passWord, String printYn, String slipNo, String fixCustCd, String sndCustNm, String sndTelNo, String sndHandNo, String sndZipCd, String sndZipSeq, String sndCustAddr1, String sndCustAddr2, String rcvCustNm, String rcvTelNo, String rcvHandNo, String rcvZipCd, String rcvZipSeq, String rcvCustAddr1, String rcvCustAddr2, String freightType, String qty, String rcvBranCd, String goodsNm, String priceAmt, String extraAmt, String goodsAmt, String airAmtType, String shipAmtYn, String takeDt, String remarks, String fixTakeNo) {
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
