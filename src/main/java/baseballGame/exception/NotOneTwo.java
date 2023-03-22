package baseballGame.exception;

import baseballGame.utils.Result;

public class NotOneTwo extends Exception {

    public NotOneTwo() {

        super(Result.NOT_ONE_TWO.getMessage());
    }
}
