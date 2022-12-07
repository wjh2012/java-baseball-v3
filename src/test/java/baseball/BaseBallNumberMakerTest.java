package baseball;

import baseball.domain.BaseBallNumberMaker;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseBallNumberMakerTest {

    @DisplayName("중복되지 않는 1부터 9사이의 3개 숫자를 생성한다")
    @Test
    void makeUniqRandomNumber() {
        // given
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        BaseBallNumberMaker baseBallNumberMaker = new BaseBallNumberMaker(numberGenerator);

        // when
        List<Integer> numbers = baseBallNumberMaker.make();
        int result = (int) numbers.stream().distinct().count();

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }
}