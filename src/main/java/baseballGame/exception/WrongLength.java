package baseballGame.exception;

import baseballGame.utils.Result;

public class WrongLength extends Exception {

    public WrongLength() {

        super(Result.WRONG_LENGTH.getMessage());
    }
}
