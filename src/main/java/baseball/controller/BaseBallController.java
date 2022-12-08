package baseball.controller;

import baseball.NumberGenerator;
import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallNumberMaker;
import baseball.domain.Computer;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseBallController {

    private BaseBallGame baseBallGame;

    private final OutputView outputView;
    private final InputView inputView;

    public BaseBallController(BaseBallNumberMaker baseBallNumberMaker) {
        baseBallGame = new BaseBallGame(baseBallNumberMaker);

        outputView = new OutputView();
        inputView = new InputView();
    }

    public void startGame(){
        outputView.greetings();
    }

    public void guessNumber(){
        outputView.requestNumber();
        inputView.requestNumber();
    }
}
