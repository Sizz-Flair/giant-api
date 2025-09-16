package org.giant.api.domain.delivery.cj.zip.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * SoapBody 클래스
 *
 * <p>설명:
 * <p>
 * 작성자: akfur
 * 작성일: 2025-09-07
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SoapBody {
    @XmlElement(name = "getAddressInformationByValue",
            namespace = "http://webservice.address.nplus.doortodoor.co.kr/")
    private GetAddressInformationByValue request;
}