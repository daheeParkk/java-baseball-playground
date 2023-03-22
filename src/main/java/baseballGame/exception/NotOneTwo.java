package baseballGame.exception;

import static baseballGame.utils.ExceptionMessage.NOT_ONE_TWO;

public class NotOneTwo extends Exception {

    public NotOneTwo() {

        super(NOT_ONE_TWO.getMessage());
    }
}
