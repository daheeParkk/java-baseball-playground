package baseballGame.utils;

public enum ErrorMessage {

    DUPLICATE_NUMBER("숫자 중복 오류"),
    WRONG_LENGTH("숫자 길이 오류"),
    NOT_NUMBER("숫자 포맷 오류"),
    NOT_ONE_TWO("숫자 입력 오류");

    private final String message;

    ErrorMessage(String message) {

        this.message = message;
    }

    public String getMessage() {

        return message;
    }
}
