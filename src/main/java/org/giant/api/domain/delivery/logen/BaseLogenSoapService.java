package org.giant.api.domain.delivery.logen;

import lombok.RequiredArgsConstructor;
import org.springframework.util.Assert;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class BaseLogenSoapService {

    private final WebServiceTemplate webServiceTemplate;

    protected List<String> splitResponseData(final String data, final String regex) {
        return Arrays.asList(data.split(regex));
    }

    protected <T> T callSoap(final String url, final Object request, final String action, Class<T> responseType) {
        Object result = webServiceTemplate.marshalSendAndReceive(url, request, new SoapActionCallback(action));
        return responseType.cast(result);
    }

    protected <T> Optional<T> safeCallSoap(final String url, final Object request, final String action, Class<T> responseType) {
        try {
            Object result = webServiceTemplate.marshalSendAndReceive(url, request, new SoapActionCallback(action));
            return Optional.of(responseType.cast(result));
        } catch (WebServiceIOException e) {
            throw new IllegalStateException("SOAP 응답 실패");
        } catch (ClassCastException e) {
            throw new IllegalStateException("SOAP 응답 타입 캐스팅 실패");
        }
    }

    protected void assertLogenInfo(final LogenUserInfoDto info) {
        Assert.notNull(info ,"");
        Assert.notNull(info.getUserId() ,"");
        Assert.notNull(info.getPassWord() ,"");
        Assert.hasText(info.getUserId() ,"");
        Assert.hasText(info.getPassWord() ,"");
    }

    protected void checkResponseData(final String responseData) {
        if(responseData.contains("FALSE")) {
            throw new IllegalStateException(responseData);
        }
    }
}
