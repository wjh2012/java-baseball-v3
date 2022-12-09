package baseball.view;

import java.util.List;

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

    public void ballAndStrike(int ball, int strike){
        List<String> result = List.of(ball(ball), strike(strike));
        System.out.println(String.join(" ", result));
    }

    private String ball(int n) {
        if (n != 0) {
            return Integer.toString(n);
        }
        return "";
    }

    private String strike(int n) {
        if (n != 0) {
            return Integer.toString(n);
        }
        return "";
    }

    public void nothing() {
        System.out.println("낫싱");
    }
}
