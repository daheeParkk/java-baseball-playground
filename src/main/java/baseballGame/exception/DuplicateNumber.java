package baseballGame.exception;

import static baseballGame.utils.ErrorMessage.*;

public class DuplicateNumber extends Exception {

    public DuplicateNumber() {

        super(DUPLICATE_NUMBER.getMessage());
    }
}
