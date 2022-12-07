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

    public int countExactValue(List<Integer> numbers) {
        return
                (int) IntStream
                        .range(0, NUMBER_SIZE)
                        .mapToObj(index -> Objects.equals(this.numbers.get(index), numbers.get(index)))
                        .count();
    }

    public int countHasValue(List<Integer> numbers) {
        return
                (int) numbers.stream()
                        .map(this.numbers::contains)
                        .count();
    }
}
