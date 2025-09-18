package org.giant.api.domain.delivery.cj.zip.model.request;

import jakarta.xml.bind.annotation.*;

/**
 * GetAddressInformationByValue 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(
        name = "getAddressInformationByValue",
        namespace = "http://webservice.address.nplus.doortodoor.co.kr/"
)
public class GetAddressInformationByValue {

    @XmlElement(name = "arg0")
    private AddressRequest arg0;

    public GetAddressInformationByValue() {}

    public GetAddressInformationByValue(AddressRequest arg0) {
        this.arg0 = arg0;
    }
}