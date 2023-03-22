package baseballGame.exception;

import static baseballGame.utils.ExceptionMessage.NOT_NUMBER;

public class NotNumber extends Exception {

    public NotNumber() {

        super(NOT_NUMBER.getMessage());
    }
}
