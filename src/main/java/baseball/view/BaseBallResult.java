package baseball.view;

public class BaseBallResult {

    private final int ball;
    private final int strike;

    public BaseBallResult(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

}
