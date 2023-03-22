package baseballGame.service;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;

public class InputService {

    public void checkCollect(String inputBalls) throws DuplicateNumber, WrongLength, NotNumber {

        if (inputBalls.length() != BallService.NUMBER_OF_BALLS) {

            throw new WrongLength();
        }

        char firstBall = inputBalls.charAt(0);
        char secondBall = inputBalls.charAt(1);
        char thirdBall = inputBalls.charAt(2);

        if (!isNumeric(inputBalls)) {

            throw new NotNumber();
        }

        if (firstBall == secondBall || firstBall == thirdBall || secondBall == thirdBall) {

            throw new DuplicateNumber();
        }
    }

    private boolean isNumeric(String inputBalls) {

        return inputBalls.chars().allMatch(Character::isDigit);
    }

    public void checkOneTwo(String isRestart) throws NotOneTwo, NotNumber {

        if (!isNumeric(isRestart)) {

            throw new NotNumber();
        }

        if (!isRestart.equals("1") && !isRestart.equals("2")) {

            throw new NotOneTwo();
        }
    }
}
