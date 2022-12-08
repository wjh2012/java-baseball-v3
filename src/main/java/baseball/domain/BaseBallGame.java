package baseball.domain;

import java.util.List;

public class BaseBallGame {

    private final Computer computer;

    public BaseBallGame(BaseBallNumberMaker baseBallNumberMaker){
        List<Integer> numbers = baseBallNumberMaker.make();
        computer = new Computer(numbers);
    }

    public List<Integer> getBallAndStrike(List<Integer> numbers) {
        int strike = computer.countExactValue(numbers);
        int ball = computer.countHasValue(numbers) - strike;
        return List.of(ball, strike);
    }
}
