package baseballGame.exception;

import baseballGame.ui.Result;

public class NotOneTwo extends Exception {

    public NotOneTwo() {

        super(Result.NOT_ONE_TWO.getMessage());
    }

    public NotOneTwo(String msg) {

        super(msg);
    }
}
