package baseballGame.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallService {

    public static final int NUMBER_OF_BALLS = 3;
    private final Random random = new Random();
    private List<Integer> balls;

    public List<Integer> createBalls() {

        balls = new ArrayList<>();

        while (balls.size() < NUMBER_OF_BALLS) {

            createRandomNum();
        }

        return balls;
    }

    private void createRandomNum() {

        int num = random.nextInt(8) + 1;

        if (!checkDuplication(num)) {

            balls.add(num);
        }
    }

    private boolean checkDuplication(int num) {

        return balls.contains(num);
    }
}
