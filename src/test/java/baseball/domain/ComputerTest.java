package baseball.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @DisplayName("위치와 숫자가 모두 맞으면 0,3")
    @Test
    void strike() {
        // given
        Computer computer = new Computer(List.of(1, 2, 3));

        // when
        List<Integer> ballAndStrike = computer.getBallAndStrike(List.of(1, 2, 3));

        // then
        Assertions.assertThat(ballAndStrike).isEqualTo(List.of(0, 3));
    }

    @DisplayName("숫자를 포함하기만 하면 3,0")
    @Test
    void ball() {
        // given
        Computer computer = new Computer(List.of(1, 2, 3));

        // when
        List<Integer> ballAndStrike = computer.getBallAndStrike(List.of(2, 3, 1));

        // then
        Assertions.assertThat(ballAndStrike).isEqualTo(List.of(3, 0));
    }

    @DisplayName("아무것도 포함하지 않으면 0,0")
    @Test
    void none() {
        // given
        Computer computer = new Computer(List.of(1, 2, 3));

        // when
        List<Integer> ballAndStrike = computer.getBallAndStrike(List.of(9, 8, 7));

        // then
        Assertions.assertThat(ballAndStrike).isEqualTo(List.of(0, 0));
    }

}