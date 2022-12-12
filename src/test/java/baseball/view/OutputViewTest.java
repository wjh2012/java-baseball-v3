package baseball.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OutputViewTest {

    @Test
    void ball_strike() {
        OutputView outputView = new OutputView();
        BaseBallResult baseBallResult = new BaseBallResult(1, 1);

        outputView.result(baseBallResult);
    }

    @Test
    void strike() {
        OutputView outputView = new OutputView();
        BaseBallResult baseBallResult = new BaseBallResult(0, 1);

        outputView.result(baseBallResult);
    }

    @Test
    void ball() {
        OutputView outputView = new OutputView();
        BaseBallResult baseBallResult = new BaseBallResult(1, 0);

        outputView.result(baseBallResult);
    }

    @Test
    void nothing() {
        OutputView outputView = new OutputView();
        BaseBallResult baseBallResult = new BaseBallResult(0, 0);

        outputView.result(baseBallResult);
    }
}