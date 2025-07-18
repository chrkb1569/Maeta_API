package maeta.api.domain.occupation.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "occupation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Occupation {

    @Id
    @Column(name = "occupation_name", nullable = false)
    private OccupationName occupationName;                  // 직업명 (히어로, 다크나이트, 팔라딘)

    @Enumerated(value = EnumType.STRING)
    @Column(name = "occupation_class", nullable = false)
    private OccupationClass occupationClass;                // 소속 (모험가, 시그너스, 레지스탕스)

    @Enumerated(value = EnumType.STRING)
    @Column(name = "occupation_type", nullable = false)
    private OccupationType occupationType;                  // 직업 분류 (전사, 궁수, 마법사)

    public Occupation(OccupationName occupationName, OccupationClass occupationClass, OccupationType occupationType) {
        this.occupationName = occupationName;
        this.occupationClass = occupationClass;
        this.occupationType = occupationType;
    }
}