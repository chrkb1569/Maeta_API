package maeta.api.domain.occupation.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import maeta.api.domain.skill.entity.Skill;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "occupation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Occupation {

    // 직업명 (히어로, 다크나이트, 팔라딘)
    @Id
    @Column(name = "occupation_name", nullable = false)
    private OccupationName occupationName;

    // 소속 (모험가, 시그너스, 레지스탕스)
    @Enumerated(value = EnumType.STRING)
    @Column(name = "occupation_class", nullable = false)
    private OccupationClass occupationClass;

    // 직업 분류 (전사, 궁수, 마법사)
    @Enumerated(value = EnumType.STRING)
    @Column(name = "occupation_type", nullable = false)
    private OccupationType occupationType;

    // 직업 스킬 정보
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "skill_seq")
    private List<Skill> skills;

    public Occupation(OccupationName occupationName, OccupationClass occupationClass, OccupationType occupationType) {
        this.occupationName = occupationName;
        this.occupationClass = occupationClass;
        this.occupationType = occupationType;
        this.skills = new ArrayList<>();
    }

    // ToDo :: 스킬 정보와 직업 정보의 연관 관계를 설정한다.
    public void saveSkill(Skill skill) {

    }

    // ToDo :: 스킬 정보와 직업 정보의 연관 관계를 끊는다.
    public void deleteSkill(Skill skill) {

    }
}