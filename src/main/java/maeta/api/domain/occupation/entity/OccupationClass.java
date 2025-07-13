package maeta.api.domain.occupation.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import maeta.api.global.util.enums.MappableEnum;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OccupationClass implements MappableEnum {
    EXPLORER("모험가"),
    CYGNUS_KNIGHTS("시그너스 기사단"),
    RESISTANCE("레지스탕스"),
    HERO("영웅"),
    NOVA("노바"),
    FLORA("레프"),
    TRANSCENDENT("초월자"),
    ANIMA("아니마"),
    FRIENDS_WORLD("프렌즈 월드")
    ;

    private final String occupationClassName; // 소속명

    @Override
    public String getValue() {
        return this.occupationClassName;
    }
}