package org.giant.api.domain.delivery.logen;

import org.giant.api.config.ApiAutoConfig;
import org.giant.api.domain.delivery.logen.trace.LogenTraceDto;
import org.giant.api.domain.delivery.logen.zip.LogenZipCodeDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApiAutoConfig.class)
class LogenApiFacadeTest {
    
    @Autowired
    LogenApiFacade logenApiFacade;

    private final LogenUserInfoDto userInfo = LogenUserInfoDto.builder()
            .userId("37856104")
            .passWord("1q2w3e4r!")
            .build();

    @Nested
    class NumberTest {
        @Test
        @DisplayName("송장채번")
        void 송장_채번() {
            //given
            int qyt = 10;

            //when
            List<String> numberList = logenApiFacade.callNumberList(userInfo, qyt);

            //then
            assertThat(numberList)
                    .isNotNull()
                    .isNotEmpty()
                    .hasSize(10);
        }

        @Test
        @DisplayName("코드만료")
        void 코드만료() {
            //given
            LogenUserInfoDto emptyUserInfo = LogenUserInfoDto.builder()
                    .userId("38556668")
                    .passWord("1q2w3e4r!")
                    .build();
            int qyt = 10;

            //then
            assertThatThrownBy(() -> logenApiFacade.callNumberList(emptyUserInfo, qyt))
                    .isInstanceOf(IllegalStateException.class);

        }

        @Test
        @DisplayName("송장채번 유저정보 누락")
        void 송장_채번_유저정보_누락() {
            //given
            LogenUserInfoDto emptyUserInfo = LogenUserInfoDto.builder()
                    .userId("")
                    .passWord("")
                    .build();
            int qyt = 10;

            //then
            assertThatThrownBy(() -> logenApiFacade.callNumberList(emptyUserInfo, qyt))
                    .isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        @DisplayName("송장채번 유저정보 누락")
        void 송장_채번_유저정보_null() {
            //given
            int qyt = 10;

            //then
            assertThatThrownBy(() -> logenApiFacade.callNumberList(null, qyt))
                    .isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Nested
    class ZipCodeTest {

        @Test
        @DisplayName("집배코드 정상 획득")
        void 집배코드_획득() {
            //given
            String address = "인천광역시 부평구 안남로 15번길 24";

            //when
            LogenZipCodeDto logenZipCodeDto = logenApiFacade.callZipCode(userInfo, address);

            //then
            assertThat(logenZipCodeDto)
                    .isNotNull();
        }

        @Test
        @DisplayName("집배코드 잘못된 주소")
        void 집배코드_미획득() {
            //given
            String address = "소환사의 협곡 미드 24-1";

            //then
            assertThatThrownBy(() -> logenApiFacade.callZipCode(userInfo, address))
                    .isInstanceOf(IllegalStateException.class);
        }
    }

    @Nested
    class TraceTest {
        @Test
        @DisplayName("")
        void 트랙킹_정상조회() {
            //given
            String number = "90863436856";

            //when
            List<LogenTraceDto> logenTraceDtos = logenApiFacade.callTrace(userInfo, number);

            //then
            assertThat(logenTraceDtos)
            .isNotNull()
            .isNotEmpty();
        }

        @Test
        @DisplayName("")
        void 트랙킹_정보없음() {
            //given
            String number = "11111111111";

            //when
            List<LogenTraceDto> logenTraceDtos = logenApiFacade.callTrace(userInfo, number);

            //then
            assertThat(logenTraceDtos)
                    .isEmpty();
        }
    }
}