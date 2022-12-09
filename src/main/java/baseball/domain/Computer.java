package baseball.domain;

import static baseball.constants.Constants.GAME_NUMBER_SIZE;

import java.util.List;
import java.util.stream.IntStream;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int countExactValue(List<Integer> numbers) {
        return
                (int) IntStream
                        .range(0, GAME_NUMBER_SIZE)
                        .filter(index -> this.numbers.get(index).equals(numbers.get(index)))
                        .count();
    }

    public int countHasValue(List<Integer> numbers) {
        return
                (int) numbers.stream()
                        .filter(this.numbers::contains)
                        .count();
    }
}
