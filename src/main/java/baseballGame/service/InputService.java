package baseballGame.service;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;

import java.util.Arrays;
import java.util.List;

import static baseballGame.service.BallService.*;

public class InputService {

    private static final String RESTART_NUMBER = "1";
    private static final String GAME_OVER_NUMBER = "2";

    public void checkCollect(String inputBalls) throws DuplicateNumber, WrongLength, NotNumber {

        if (inputBalls.length() != NUMBER_OF_BALLS) {

            throw new WrongLength();
        }

        if (isNumeric(inputBalls)) {

            throw new NotNumber();
        }

        List<String> ballNumbers = Arrays.asList(inputBalls.split(""));

        if (ballNumbers.size() != ballNumbers.stream().distinct().count()) {

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
