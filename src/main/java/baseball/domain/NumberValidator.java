package baseball.domain;

import static baseball.constants.Constants.GAME_NUMBER_SIZE;

import java.util.List;

public class NumberValidator {

    public boolean validateAll(List<Integer> numbers) {
        try {
            validateSize(numbers);
            validateUniq(numbers);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != GAME_NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private void validateUniq(List<Integer> numbers) {
        int result = (int) numbers.stream().distinct().count();
        if (result != GAME_NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }
}
