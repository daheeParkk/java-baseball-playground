package baseballGame.exception;

import baseballGame.ui.Result;

public class WrongLength extends Exception {

    public WrongLength() {

        super(Result.WRONG_LENGTH.getMessage());
    }
}
