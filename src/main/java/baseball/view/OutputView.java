package baseball.view;

public class OutputView {

    public void greetings() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void requestNumber() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public void gameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void requestRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void ball() {
        System.out.println("볼");
    }

    public void strike() {
        System.out.println("스트라이크");
    }

    public void nothing() {
        System.out.println("낫싱");
    }
}
