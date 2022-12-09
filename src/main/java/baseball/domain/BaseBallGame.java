package baseball.domain;

import java.util.List;

public class BaseBallGame {

    private final BaseBallNumberMaker baseBallNumberMaker;
    private Computer computer;
    private final NumberValidator numberValidator;

    public BaseBallGame(BaseBallNumberMaker baseBallNumberMaker) {
        this.baseBallNumberMaker = baseBallNumberMaker;
        this.numberValidator = new NumberValidator();
    }

    public void setComputer() {
        List<Integer> numbers = baseBallNumberMaker.make();
        computer = new Computer(numbers);
    }

    public BallAndStrikeResult getBallAndStrike(List<Integer> numbers) {
        numberValidator.validateAll(numbers);

        int strike = computer.countExactValue(numbers);
        int ball = computer.countHasValue(numbers) - strike;

        return new BallAndStrikeResult(ball, strike);
    }

}
