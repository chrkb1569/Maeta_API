package maeta.api.domain.skill.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SkillType {
    ACTIVE_SKILL("액티브 스킬"),
    PASSIVE_SKILL("패시브 스킬")
    ;

    private final String skillType;
}