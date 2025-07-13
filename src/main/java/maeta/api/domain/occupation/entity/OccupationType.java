package maeta.api.domain.occupation.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import maeta.api.global.util.enums.MappableEnum;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OccupationType implements MappableEnum {
    WARRIOR("전사"),
    MAGICIAN("마법사"),
    BOWMAN("궁수"),
    THIEF("도적"),
    PIRATE("해적")
    ;

    private final String occupationType; // 직업 분류

    @Override
    public String getValue() {
        return this.occupationType;
    }
}