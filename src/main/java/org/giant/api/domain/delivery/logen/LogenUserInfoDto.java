package org.giant.api.domain.delivery.logen;

import lombok.Builder;
import lombok.Getter;

@Getter
public class LogenUserInfoDto {

    private String userId;
    private String passWord;

    @Builder
    private LogenUserInfoDto(String userId, String passWord) {
        this.userId = userId;
        this.passWord = passWord;
    }
}
