package maeta.api.global.factory.util.enums;

import maeta.api.domain.occupation.entity.OccupationClass;
import maeta.api.domain.occupation.entity.OccupationName;
import maeta.api.domain.occupation.entity.OccupationType;
import maeta.api.global.util.enums.MappableEnum;

import static maeta.api.domain.occupation.entity.OccupationClass.*;
import static maeta.api.domain.occupation.entity.OccupationName.*;
import static maeta.api.domain.occupation.entity.OccupationType.*;

public enum EnumUtilFactory {
    // 실패 테스트
    FAILURE_TEST_CASE_1("FAILURE_VALUE1", OccupationClass.values()),
    FAILURE_TEST_CASE_2("FAILURE_VALUE2", OccupationName.values()),
    FAILURE_TEST_CASE_3("FAILURE_VALUE3", OccupationType.values()),

    // 성공 테스트
    SUCCESS_TEST_CASE_1(EXPLORER.getValue(), OccupationClass.values()),
    SUCCESS_TEST_CASE_2(DUAL_BLADE.getValue(), OccupationName.values()),
    SUCCESS_TEST_CASE_3(THIEF.getValue(), OccupationType.values())
    ;

    private final String value;
    private final MappableEnum[] mappableEnum;

    EnumUtilFactory(String value, MappableEnum[] mappableEnum) {
        this.value = value;
        this.mappableEnum = mappableEnum;
    }

    public String getValue() {
        return this.value;
    }

    public MappableEnum[] getMappableEnum() {
        return this.mappableEnum;
    }
}