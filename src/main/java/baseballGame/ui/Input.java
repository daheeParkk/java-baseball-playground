package baseballGame.ui;

public enum Input {

    NUM("숫자를 입력해 주세요 : "),
    AGAIN("숫자 3개를 다시 입력해 주세요"),
    IS_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    Input(String message) {

        this.message = message;
    }

    public String getMessage() {

        return message;
    }

}
