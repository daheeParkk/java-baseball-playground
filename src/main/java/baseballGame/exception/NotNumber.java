package baseballGame.exception;

import baseballGame.utils.Result;

public class NotNumber extends Exception {

    public NotNumber() {

        super(Result.NOT_NUMBER.getMessage());
    }
}
