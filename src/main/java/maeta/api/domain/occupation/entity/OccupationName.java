package maeta.api.domain.occupation.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import maeta.api.global.util.enums.MappableEnum;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OccupationName implements MappableEnum {
    // 모험가
    // 전사
    HERO("히어로"),
    PALADIN("팔라딘"),
    DARK_KNIGHT("다크나이트"),

    // 마법사
    ARCH_MAGE_FIRE_POISON("아크메이지 (불, 독)"),
    ARCH_MAGE_ICE_LIGHTNING("아크메이지 (썬, 콜)"),
    BISHOP("비숍"),

    // 궁수
    BOW_MASTER("보우마스터"),
    MARKSMAN("신궁"),
    PATH_FINDER("패스파인더"),

    // 도적
    NIGHT_LORD("나이트로드"),
    SHADOWER("섀도어"),
    DUAL_BLADE("듀얼블레이드"),

    // 해적
    VIPER("바이퍼"),
    CAPTAIN("캡틴"),
    CANNON_SHOOTER("캐논슈터"),

    // 시그너스 기사단
    // 전사
    SOUL_MASTER("소울마스터"),
    MIHILE("미하일"),

    // 마법사
    FLAME_WIZARD("플레임위자드"),

    // 궁수
    WIND_BREAKER("윈드브레이커"),

    // 도적
    NIGHT_WALKER("나이트워커"),

    // 해적
    STRIKER("스트라이커"),

    // 레지스탕스
    // 전사
    BLASTER("블래스터"),
    DEMON_SLAYER("데몬슬레이어"),
    DEMON_AVENGER("데몬어벤저"),

    // 마법사
    BATTLE_MAGE("배틀메이지"),

    // 궁수
    WILD_HUNTER("와일드헌터"),

    // 도적
    XENON("제논"),

    // 해적
    MECHANIC("메카닉"),

    // 영웅
    // 전사
    ARAN("아란"),

    // 마법사
    EVAN("에반"),
    LUMINOUS("루미너스"),

    // 궁수
    MERCEDES("메르세데스"),

    // 도적
    PHANTOM("팬텀"),

    // 해적
    EUNWOL("은월"),

    // 노바
    // 전사
    KAISER("카이저"),

    // 마법사

    // 궁수

    // 도적
    CADENA("카데나"),

    // 해적
    ANGELIC_BUSTER("엔젤릭버스터"),

    // 레프
    // 전사
    ADELE("아델"),

    // 마법사
    ILLIUM("일리움"),

    // 궁수
    KAIN("카인"),

    // 도적
    KHALI("칼리"),

    // 해적
    ARK("아크"),

    // 초월자
    // 전사
    ZERO("제로"),

    // 마법사

    // 궁수

    // 도적

    // 해적

    // 아니마
    // 전사
    REN("렌"),

    // 마법사
    LARA("라라"),

    // 궁수

    // 도적
    HOYOUNG("호영"),

    // 해적

    // 프렌즈 월드
    // 전사

    // 마법사
    KINESIS("키네시스")

    // 궁수

    // 도적

    // 해적
    ;

    private final String occupationName;

    @Override
    public String getValue() {
        return this.occupationName;
    }
}