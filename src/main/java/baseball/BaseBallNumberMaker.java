package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBallNumberMaker {

    private static final int NUMBER_SIZE = 3;

    private final NumberGenerator baseBallNumberGenerator;

    public BaseBallNumberMaker(NumberGenerator baseBallNumberGenerator) {
        this.baseBallNumberGenerator = baseBallNumberGenerator;
    }

    public List<Integer> make() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            int randomNumber = baseBallNumberGenerator.generate();
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}
