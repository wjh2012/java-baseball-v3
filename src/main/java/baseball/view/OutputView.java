package baseball.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OutputView {

    public void greetings() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void requestNumber() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void requestRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void result(BaseBallResult baseBallResult) {
        String result = makeResult(baseBallResult);
        System.out.println(result);
    }

    private String makeResult(BaseBallResult baseBallResult) {
        List<String> result = new ArrayList<>();
        isBall(baseBallResult.getBall()).ifPresent(result::add);
        isStrike(baseBallResult.getStrike()).ifPresent(result::add);

        if (result.isEmpty()) {
            return "낫싱";
        }
        return String.join(" ", result);
    }

    private Optional<String> isBall(int ball) {
        return Optional.ofNullable(ball)
                .filter(n -> n != 0)
                .map(n -> n + "볼");
    }

    private Optional<String> isStrike(int strike) {
        return Optional.ofNullable(strike)
                .filter(n -> n != 0)
                .map(n -> n + "스트라이크");
    }

}
