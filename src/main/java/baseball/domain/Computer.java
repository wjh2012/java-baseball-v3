package baseball.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Computer {

    private static final int NUMBER_SIZE = 3;

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getBallAndStrike(List<Integer> numbers) {
        int strike = countExactValue(numbers);
        int ball = countHasValue(numbers) - strike;
        return List.of(ball, strike);
    }

    private int countExactValue(List<Integer> numbers) {
        return
                (int) IntStream
                        .range(0, NUMBER_SIZE)
                        .filter(index -> this.numbers.get(index).equals(numbers.get(index)))
                        .count();
    }

    private int countHasValue(List<Integer> numbers) {
        return
                (int) numbers.stream()
                        .filter(this.numbers::contains)
                        .count();
    }
}
