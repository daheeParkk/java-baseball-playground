package baseballGame.service;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;

import static baseballGame.service.BallService.*;

public class InputService {

    private static final String RESTART_NUMBER = "1";
    private static final String GAME_OVER_NUMBER = "2";

    public void checkCollect(String inputBalls) throws DuplicateNumber, WrongLength, NotNumber {

        if (inputBalls.length() != NUMBER_OF_BALLS) {

            throw new WrongLength();
        }

        char firstBall = inputBalls.charAt(0);
        char secondBall = inputBalls.charAt(1);
        char thirdBall = inputBalls.charAt(2);

        if (isNumeric(inputBalls)) {

            throw new NotNumber();
        }

        if (firstBall == secondBall || firstBall == thirdBall || secondBall == thirdBall) {

            throw new DuplicateNumber();
        }
    }

    private boolean isNumeric(String inputBalls) {

        return !inputBalls.chars().allMatch(Character::isDigit);
    }

    public void checkOneTwo(String isRestart) throws NotOneTwo, NotNumber {

        if (isNumeric(isRestart)) {

            throw new NotNumber();
        }

        if (!isRestart.equals(RESTART_NUMBER) && !isRestart.equals(GAME_OVER_NUMBER)) {

            throw new NotOneTwo();
        }
    }
}
