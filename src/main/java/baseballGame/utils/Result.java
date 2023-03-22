package baseballGame.utils;

public enum Result {

    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),

    GAME_OVER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),

    DUPLICATE_NUMBER("숫자 중복 오류"),
    WRONG_LENGTH("숫자 길이 오류"),
    NOT_NUMBER("숫자 포맷 오류"),
    NOT_ONE_TWO("숫자 입력 오류");

    private final String message;

    Result(String message) {

        this.message = message;
    }

    public String getMessage() {

        return message;
    }
}
