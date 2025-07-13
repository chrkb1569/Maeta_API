package maeta.api.global.util;

import lombok.experimental.UtilityClass;
import maeta.api.domain.occupation.entity.OccupationClass;
import maeta.api.domain.occupation.entity.OccupationName;
import maeta.api.domain.occupation.entity.OccupationType;

import static maeta.api.global.util.enums.EnumUtil.*;

@UtilityClass
public class OccupationUtil {

    // 직업계층 정보를 Enum 클래스로 변환한다.
    public OccupationClass convertToOccupationClass(String occupationClass) {
        return convertValue(occupationClass, OccupationClass.values());
    }

    // 직업군 정보를 Enum 클래스로 변환한다.
    public OccupationType convertToOccupationType(String occupationType) {
        return convertValue(occupationType, OccupationType.values());
    }

    // 직업명을 Enum 클래스로 변환한다.
    public OccupationName convertToOccupationName(String occupationName) {
        return convertValue(occupationName, OccupationName.values());
    }
}