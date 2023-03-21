package baseballGame.result;

public enum Result {

    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),

    GAME_OVER("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String message;

    Result(String message) {

        this.message = message;
    }

    public String getMessage() {

        return message;
    }
}
