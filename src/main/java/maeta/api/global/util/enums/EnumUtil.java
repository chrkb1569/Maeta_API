package maeta.api.global.util.enums;

import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class EnumUtil {

    // Enum 클래스에 선언되어 있는 값 중, key 값과 일치하는 정보 반환
    public <T extends Enum<T> & MappableEnum> T convertValue(String key, T[] enumInfoArr) {
        return Arrays.stream(enumInfoArr)
                        .filter(info -> key.equals(info.getValue()))
                        .findFirst()
                        .orElseThrow();
    }
}