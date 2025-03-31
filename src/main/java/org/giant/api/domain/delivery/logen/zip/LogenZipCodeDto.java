package org.giant.api.domain.delivery.logen.zip;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LogenZipCodeDto {
    private String deliveryZone;   // 배송지점
    private String townName;       // 읍/면/동
    private String arrivalCode;    // 도착점코드 (분류코드)
    private String zipCode;        // 우편번호

    private String isJeju;         // 제주지역 여부 (Y/N)
    private String isMarine;       // 해운지역 여부 (Y/N)
    private String isMountain;     // 산간지역 여부 (Y/N)

    private String agencyName;     // 배송 영업소명
    private String isInArea;       // 관내배송 여부 (Y/N)
    private String terminalName;   // 배송 터미널

    @Builder
    public LogenZipCodeDto(String deliveryZone, String townName, String arrivalCode, String zipCode, String isJeju, String isMarine, String isMountain, String agencyName, String isInArea, String terminalName) {
        this.deliveryZone = deliveryZone;
        this.townName = townName;
        this.arrivalCode = arrivalCode;
        this.zipCode = zipCode;
        this.isJeju = isJeju;
        this.isMarine = isMarine;
        this.isMountain = isMountain;
        this.agencyName = agencyName;
        this.isInArea = isInArea;
        this.terminalName = terminalName;
    }
}
