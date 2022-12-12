package baseball.controller;

import static baseball.constants.SelectOption.END;
import static baseball.constants.SelectOption.isRestart;

import baseball.domain.BaseBallGame;
import baseball.view.BaseBallResult;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseBallController {

    private final BaseBallGame baseBallGame;

    private final OutputView outputView;
    private final InputView inputView;

    public BaseBallController(BaseBallGame baseBallGame) {
        this.baseBallGame = baseBallGame;

        outputView = new OutputView();
        inputView = new InputView();
    }

    public void startGame() {
        outputView.greetings();
        baseBallGame.setComputer();
    }

    public void play() {
        do {
            guess();
        } while (!requestRestart());
    }

    public void guess() {
        BaseBallResult result;
        do {
            List<Integer> input = inputBaseballNumber();
            result = baseBallGame.getBallAndStrike(input);
            printResult(result);
        } while (!baseBallGame.isOver(result.getStrike()));
    }

    private boolean requestRestart() {
        outputView.requestRestart();
        String input = inputView.requestRestart();
        return isRestart(input) == END;
    }

    private List<Integer> inputBaseballNumber() {
        outputView.requestNumber();
        String input = inputView.requestNumber();
        try {
            return convertNumbers(input);
        } catch (Exception e) {
            throw new IllegalArgumentException("잘못된 입력", e);
        }
    }

    private List<Integer> convertNumbers(String input) {
        return Stream.of(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private void printResult(BaseBallResult result) {
        outputView.result(result);
    }
}
