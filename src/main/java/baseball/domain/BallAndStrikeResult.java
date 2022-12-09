package baseball.domain;

public class BallAndStrikeResult {

    private int ball;
    private int strike;

    public BallAndStrikeResult(int ball, int strike) {
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
