package baseball.domain;

import static baseball.constants.Constants.GAME_NUMBER_SIZE;
import static baseball.constants.NumberValidator.validateNumbers;

import baseball.view.BaseBallResult;
import java.util.List;

public class BaseBallGame {

    private final BaseBallNumberMaker baseBallNumberMaker;
    private Computer computer;

    public BaseBallGame(BaseBallNumberMaker baseBallNumberMaker) {
        this.baseBallNumberMaker = baseBallNumberMaker;
    }

    public void setComputer() {
        List<Integer> numbers = baseBallNumberMaker.make();
        computer = new Computer(numbers);
    }

    public BaseBallResult getBallAndStrike(List<Integer> numbers) {
        validateNumbers(numbers);

        int strike = computer.countExactValue(numbers);
        int ball = computer.countHasValue(numbers) - strike;

        return new BaseBallResult(ball, strike);
    }

    public boolean isOver(int n) {
        return GAME_NUMBER_SIZE == n;
    }

}
