package baseball;

import baseball.controller.BaseBallController;
import baseball.domain.BaseBallGame;
import baseball.domain.BaseBallNumberMaker;

public class Application {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        BaseBallNumberMaker baseBallNumberMaker = new BaseBallNumberMaker(randomNumberGenerator);

        BaseBallGame baseBallGame = new BaseBallGame(baseBallNumberMaker);
        BaseBallController baseBallController = new BaseBallController(baseBallGame);

        baseBallController.startGame();
        baseBallController.play();

    }
}
