package org.giant.api.domain.delivery.cj.zip.model.response;

/**
 * GetAddressInformationByValueResponse 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(
        name = "getAddressInformationByValueResponse",
        namespace = "http://webservice.address.nplus.doortodoor.co.kr/"
)
public class GetAddressInformationByValueResponse {

    @XmlElement(name = "return")
    private AddressInfo addressInfo;

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }
}

