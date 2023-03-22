package baseballGame.exception;

import baseballGame.ui.Result;

public class NotNumber extends Exception {

    public NotNumber() {

        super(Result.NOT_NUMBER.getMessage());
    }
}
