package baseballGame.service;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.WrongLength;

public class InputService {

    public void checkCollect(String inputBalls) throws DuplicateNumber, WrongLength, NotNumber {

        char firstBall = inputBalls.charAt(0);
        char secondBall = inputBalls.charAt(1);
        char thirdBall = inputBalls.charAt(2);

        if (!isNumeric(inputBalls)) {

            throw new NotNumber();
        }

        if (inputBalls.length() != 3) {

            throw new WrongLength();
        }

        if (firstBall == secondBall || firstBall == thirdBall || secondBall == thirdBall) {

            throw new DuplicateNumber();
        }
    }

    private boolean isNumeric(String inputBalls) {

        return inputBalls.chars().allMatch(Character::isDigit);
    }
}
