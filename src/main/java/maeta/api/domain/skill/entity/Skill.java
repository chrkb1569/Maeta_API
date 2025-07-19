package maeta.api.domain.skill.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import maeta.api.domain.occupation.entity.Occupation;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Table(name = "skill")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Skill {

    @Id
    @Column(name = "skill_seq", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    // 스킬명
    @Column(name = "skill_name", nullable = false)
    private String skillName;

    // 캐릭터 직업
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "occupation_seq", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Occupation occupation;

    // 차수
    @Enumerated(value = EnumType.STRING)
    @Column(name = "skill_tier", nullable = false)
    private SkillTier skillTier;

    // 스킬 설명
    @Column(name = "content", nullable = false)
    private String content;

    // 스킬 타입 (패시브, 액티브)
    @Enumerated(value = EnumType.STRING)
    @Column(name = "skill_type", nullable = false)
    private SkillType skillType;

    // 스킬 쿨타임
    @Column(name = "colldown_time", nullable = false)
    private Long cooldownTime;

    public Skill(String skillName, Occupation occupation, SkillTier skillTier, String content, SkillType skillType, Long cooldownTime) {
        this.skillName = skillName;
        this.occupation = occupation;
        this.skillTier = skillTier;
        this.content = content;
        this.skillType = skillType;
        this.cooldownTime = cooldownTime;
    }
}