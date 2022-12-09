package baseball.domain;

import static baseball.constants.Constants.GAME_NUMBER_SIZE;

import baseball.NumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class BaseBallNumberMaker {
    private final NumberGenerator baseBallNumberGenerator;

    public BaseBallNumberMaker(NumberGenerator baseBallNumberGenerator) {
        this.baseBallNumberGenerator = baseBallNumberGenerator;
    }

    public List<Integer> make() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < GAME_NUMBER_SIZE) {
            int randomNumber = baseBallNumberGenerator.generate();
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
