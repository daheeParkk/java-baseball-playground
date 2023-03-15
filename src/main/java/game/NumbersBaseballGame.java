package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumbersBaseballGame {

    public int[] generateRandomNumbers() {

        Random random = new Random();
        int[] randomNums = new int[3];
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i=0; i<3; i++) {

            int index = random.nextInt(numberList.size()-1);
            randomNums[i] = numberList.get(index);
            numberList.remove(index);
        }

        return randomNums;
    }
}
