package baseball.constants;

import static baseball.constants.Constants.GAME_NUMBER_SIZE;

import java.util.List;

public class NumberValidator {

    public static boolean validateNumbers(List<Integer> numbers) {
        try {
            validateNumbersSize(numbers);
            validateNumbersUniq(numbers);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }

    private static void validateNumbersSize(List<Integer> numbers) {
        if (numbers.size() != GAME_NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateNumbersUniq(List<Integer> numbers) {
        int result = (int) numbers.stream().distinct().count();
        if (result != GAME_NUMBER_SIZE) {
            throw new IllegalArgumentException();
        }
    }

}
