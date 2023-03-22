package baseballGame.exception;

import static baseballGame.utils.ExceptionMessage.WRONG_LENGTH;

public class WrongLength extends Exception {

    public WrongLength() {

        super(WRONG_LENGTH.getMessage());
    }
}
