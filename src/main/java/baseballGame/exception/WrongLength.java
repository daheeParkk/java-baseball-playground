package baseballGame.exception;

import static baseballGame.utils.ErrorMessage.WRONG_LENGTH;

public class WrongLength extends Exception {

    public WrongLength() {

        super(WRONG_LENGTH.getMessage());
    }
}
