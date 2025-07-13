package maeta.api.global.util;

import maeta.api.domain.occupation.entity.OccupationClass;
import maeta.api.global.factory.util.enums.EnumUtilFactory;
import maeta.api.global.util.enums.EnumUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static maeta.api.global.factory.util.enums.EnumUtilFactory.FAILURE_TEST_CASE_1;
import static maeta.api.global.factory.util.enums.EnumUtilFactory.SUCCESS_TEST_CASE_1;

@DisplayName("[Utility Class Test :: EnumUtil]")
public class EnumUtilTest {

    @Nested
    @DisplayName("EnumUtil.convertValue() 메서드를 테스트한다.")
    public class convertValueTest {

        @Test
        @DisplayName("존재하지 않는 코드 값을 통하여 메서드를 호출하는 경우, 오류가 발생한다.")
        public void failure() {
            // given
            EnumUtilFactory failureCase = FAILURE_TEST_CASE_1;
            String key = failureCase.getValue();
            OccupationClass[] values = (OccupationClass[]) failureCase.getMappableEnum();

            // when - then
            Assertions.assertThrows(NoSuchElementException.class, () -> EnumUtil.convertValue(key, values));
        }

        @Test
        @DisplayName("메서드 호출에 성공한다.")
        public void success() {
            // given
            EnumUtilFactory successCase = SUCCESS_TEST_CASE_1;
            String key = successCase.getValue();
            OccupationClass[] values = (OccupationClass[]) successCase.getMappableEnum();

            // when
            OccupationClass occupationClass = EnumUtil.convertValue(key, values);

            // then
            org.assertj.core.api.Assertions.assertThat(occupationClass.getValue()).isEqualTo(key);
        }
    }
}