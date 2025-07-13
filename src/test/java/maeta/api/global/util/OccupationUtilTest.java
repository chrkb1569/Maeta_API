package maeta.api.global.util;

import maeta.api.domain.occupation.entity.OccupationClass;
import maeta.api.domain.occupation.entity.OccupationName;
import maeta.api.domain.occupation.entity.OccupationType;
import maeta.api.global.factory.util.enums.EnumUtilFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static maeta.api.global.util.OccupationUtil.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[Utility Class Test :: OccupationUtil]")
public class OccupationUtilTest {

    @Nested
    @DisplayName("OccupationUtil.convertToOccupationClass() 메서드를 테스트한다.")
    public class convertToOccupationClassTest {

        @Test
        @DisplayName("존재하지 않는 코드 값을 통하여 메서드를 호출하는 경우, 오류가 발생한다.")
        public void failure() {
            // given
            EnumUtilFactory failureCase = EnumUtilFactory.FAILURE_TEST_CASE_1;
            String key = failureCase.getValue();

            // when - then
            assertThrows(NoSuchElementException.class, () -> convertToOccupationClass(key));
        }

        @Test
        @DisplayName("OccupationClass 정보 조회에 성공한다.")
        public void success() {
            // given
            EnumUtilFactory successCase = EnumUtilFactory.SUCCESS_TEST_CASE_1;
            String key = successCase.getValue();

            // when
            OccupationClass occupationClass = convertToOccupationClass(key);

            // then
            assertThat(occupationClass.getValue()).isEqualTo(key);
        }
    }

    @Nested
    @DisplayName("OccupationUtil.convertToOccupationName() 메서드를 테스트한다.")
    public class convertToOccupationNameTest {

        @Test
        @DisplayName("존재하지 않는 코드 값을 통하여 메서드를 호출하는 경우, 오류가 발생한다.")
        public void failure() {
            // given
            EnumUtilFactory failureCase = EnumUtilFactory.FAILURE_TEST_CASE_2;
            String key = failureCase.getValue();

            // when - then
            assertThrows(NoSuchElementException.class, () -> convertToOccupationName(key));
        }

        @Test
        @DisplayName("OccupationName 정보 조회에 성공한다.")
        public void success() {
            // given
            EnumUtilFactory successCase = EnumUtilFactory.SUCCESS_TEST_CASE_2;
            String key = successCase.getValue();

            // when
            OccupationName occupationName = convertToOccupationName(key);

            // then
            assertThat(occupationName.getValue()).isEqualTo(key);
        }
    }

    @Nested
    @DisplayName("OccupationUtil.convertToOccupationType() 메서드를 테스트한다.")
    public class convertToOccupationTypeTest {

        @Test
        @DisplayName("존재하지 않는 코드 값을 통하여 메서드를 호출하는 경우, 오류가 발생한다.")
        public void failure() {
            // given
            EnumUtilFactory failureCase = EnumUtilFactory.FAILURE_TEST_CASE_3;
            String key = failureCase.getValue();

            // when - then
            assertThrows(NoSuchElementException.class, () -> convertToOccupationType(key));
        }

        @Test
        @DisplayName("OccupationType 정보 조회에 성공한다.")
        public void success() {
            // given
            EnumUtilFactory successCase = EnumUtilFactory.SUCCESS_TEST_CASE_3;
            String key = successCase.getValue();

            // when
            OccupationType occupationType = convertToOccupationType(key);

            // then
            assertThat(occupationType.getValue()).isEqualTo(key);
        }
    }
}