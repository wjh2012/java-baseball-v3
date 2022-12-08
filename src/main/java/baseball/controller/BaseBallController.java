package baseball.controller;

import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallNumberMaker;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

    private final OutputView outputView;
    private final InputView inputView;
    private BaseBallGame baseBallGame;

    public BaseBallController(BaseBallNumberMaker baseBallNumberMaker) {
        baseBallGame = new BaseBallGame(baseBallNumberMaker);

        outputView = new OutputView();
        inputView = new InputView();
    }

    public void startGame() {
        outputView.greetings();
    }

    public void guessNumber() {
        outputView.requestNumber();
        inputView.requestNumber();
    }
}
