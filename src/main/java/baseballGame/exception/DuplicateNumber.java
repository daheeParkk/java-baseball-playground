package baseballGame.exception;

import baseballGame.ui.Result;

public class DuplicateNumber extends Exception {

    public DuplicateNumber() {

        super(Result.DUPLICATE_NUMBER.getMessage());
    }
}
