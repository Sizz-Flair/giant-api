package org.giant.api.domain.delivery.logen.trace;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LogenTraceDto {
    private String slipNo;               // 운송장번호
    private String scanDate;             // 스캔일자 (yyyyMMdd)
    private String scanTime;             // 스캔시간 (HHmmss)
    private String cargoStatus;         // 화물상태

    private String branchCode;          // 지점코드
    private String branchName;          // 지점명

    private String counterBranchCode;   // 상대지점코드
    private String counterBranchName;   // 상대지점명

    private String agencyCode;          // 영업소코드
    private String agencyName;          // 영업소명

    private String departure;           // 발송점
    private String arrival;             // 도착점

    private String receiverType;        // 인수자구분 (예: 본인, 대리, 문앞)

    @Builder
    public LogenTraceDto(String slipNo, String scanDate, String scanTime, String cargoStatus, String branchCode, String branchName, String counterBranchCode, String counterBranchName, String agencyCode, String agencyName, String departure, String arrival, String receiverType) {
        this.slipNo = slipNo;
        this.scanDate = scanDate;
        this.scanTime = scanTime;
        this.cargoStatus = cargoStatus;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.counterBranchCode = counterBranchCode;
        this.counterBranchName = counterBranchName;
        this.agencyCode = agencyCode;
        this.agencyName = agencyName;
        this.departure = departure;
        this.arrival = arrival;
        this.receiverType = receiverType;
    }
}
