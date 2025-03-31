package org.giant.api.domain.delivery.logen.order.service;

import org.giant.api.domain.delivery.logen.BaseLogenSoapService;
import org.giant.api.domain.delivery.logen.LogenUserInfoDto;
import org.giant.api.domain.delivery.logen.enums.LogenSoap;
import org.giant.api.domain.delivery.logen.order.LogenOrderDto;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderRequest;
import org.giant.api.domain.delivery.logen.order.model.LogenOrderResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Logen 접수
 */
@Component
public class LogenOrderService extends BaseLogenSoapService {

    public LogenOrderService(WebServiceTemplate webServiceTemplate) {
        super(webServiceTemplate);
    }

    public boolean sendOrder(final LogenUserInfoDto info, final LogenOrderDto orderDto) {
        assertLogenInfo(info);

        LogenOrderRequest logenOrderRequest = setRequest(info, orderDto);

        LogenOrderResponse response =
                callSoap(LogenSoap.ORDER.url(), logenOrderRequest, LogenSoap.ORDER.action(), LogenOrderResponse.class);

        checkResponseData(response.getResult());

        return result(response.getResult());
    }

    private LogenOrderRequest setRequest(LogenUserInfoDto info, LogenOrderDto orderDto) {
        return LogenOrderRequest.builder()
                .userID(info.getUserId())
                .passWord(info.getPassWord())
                .printYn(get(orderDto.getPrintYn()))
                .slipNo(get(orderDto.getSlipNo()))
                .fixCustCd(get(orderDto.getFixCustCd()))
                .sndCustNm(get(orderDto.getSndCustNm()))
                .sndTelNo(get(orderDto.getSndTelNo()))
                .sndHandNo(get(orderDto.getSndHandNo()))
                .sndZipCd(get(orderDto.getSndZipCd()))
                .sndZipSeq(get(orderDto.getSndZipSeq()))
                .sndCustAddr1(get(orderDto.getSndCustAddr1()))
                .sndCustAddr2(get(orderDto.getSndCustAddr2()))
                .rcvCustNm(get(orderDto.getRcvCustNm()))
                .rcvTelNo(get(orderDto.getRcvTelNo()))
                .rcvHandNo(get(orderDto.getRcvHandNo()))
                .rcvZipCd(get(orderDto.getRcvZipCd()))
                .rcvZipSeq(get(orderDto.getRcvZipSeq()))
                .rcvCustAddr1(get(orderDto.getRcvCustAddr1()))
                .rcvCustAddr2(get(orderDto.getRcvCustAddr2()))
                .freightType(get(orderDto.getFreightType()))
                .qty(get(orderDto.getQty()))
                .priceAmt(get(orderDto.getPriceAmt()))
                .extraAmt(get(orderDto.getExtraAmt()))
                .rcvBranCd(get(orderDto.getRcvBranCd()))
                .goodsNm(get(orderDto.getGoodsNm()))
                .goodsAmt(get(orderDto.getGoodsAmt()))
                .airAmtType(get(orderDto.getAirAmtType()))
                .shipAmtYn(get(orderDto.getShipAmtYn()))
                .takeDt(get(orderDto.getTakeDt()))
                .remarks(get(orderDto.getRemarks()))
                .fixTakeNo(get(orderDto.getFixTakeNo()))
                .build();
    }

    private String get(String val) {
        return (val == null) ? "" : val;
    }

    private boolean result(String result) {
        return result.equals("TRUE");
    }
}
