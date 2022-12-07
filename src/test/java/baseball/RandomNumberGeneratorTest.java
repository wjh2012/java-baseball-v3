package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    @DisplayName("1 부터 9 사이의 랜덤 숫자를 생성한다.")
    @Test
    void generateRandomNumber(){
        // given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // when
        int result = randomNumberGenerator.generate();

        // then
        Assertions.assertThat(result).isBetween(1, 9);
    }

}