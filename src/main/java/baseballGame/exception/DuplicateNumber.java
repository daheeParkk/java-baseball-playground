package baseballGame.exception;

import static baseballGame.utils.ExceptionMessage.*;

public class DuplicateNumber extends Exception {

    public DuplicateNumber() {

        super(DUPLICATE_NUMBER.getMessage());
    }
}
