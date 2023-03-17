package baseballGame;

import java.util.ArrayList;
import java.util.Random;

public class Balls {

    Random random = new Random();
    ArrayList<Integer> balls = new ArrayList<>();

    public ArrayList<Integer> createBalls() {

        while (balls.size() < 3) {

            createRandomNum(random, balls);
        }

        return balls;
    }

    private ArrayList<Integer> createRandomNum(Random random, ArrayList<Integer> balls) {

        int num = random.nextInt(8) + 1;

        if (checkDuplication(num)) {

            balls.add(num);
        }

        return balls;
    }

    private boolean checkDuplication(int num) {

        if (balls.contains(num)) {

            return false;
        }

        return true;
    }
}
