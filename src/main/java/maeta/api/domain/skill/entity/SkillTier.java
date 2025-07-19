package maeta.api.domain.skill.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SkillTier {
    SKILL_TIER_0("0차 스킬"),
    SKILL_TIER_1("1차 스킬"),
    SKILL_TIER_1_5("1.5차 스킬"),
    SKILL_TIER_2("2차 스킬"),
    SKILL_TIER_2_5("2.5차 스킬"),
    SKILL_TIER_3("3차 스킬"),
    SKILL_TIER_4("4차 스킬"),
    SKILL_TIER_HYPER("하이퍼 스킬"),
    SKILL_TIER_5("5차 스킬"),
    SKILL_TIER_6("6차 스킬"),
    SKILL_TIER_ALPHA("알파 스킬"),
    SKILL_TIER_BETA("베타 스킬")
    ;

    private final String tierName;
}