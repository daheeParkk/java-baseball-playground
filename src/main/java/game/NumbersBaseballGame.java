package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class NumbersBaseballGame {

    public ArrayList<Integer> generateRandomNumbers() {

        Random random = new Random();
        ArrayList<Integer> randomNums = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int i=0; i<3; i++) {

            int index = random.nextInt(numberList.size()-1);
            randomNums.add(i, numberList.get(index));
            numberList.remove(index);
        }

        return randomNums;
    }

    public int[] compareNumbers(String inputNumber, ArrayList<Integer> randomNums) {

        int strike = 0;
        int ball = 0;

        int[] myNums = stringToIntArray(inputNumber);

        for (int i=0; i<3; i++) {

            strike += checkStrike(myNums, randomNums, i);
            ball += checkBall(myNums, randomNums, i);
        }

        return new int[]{strike, ball};
    }

    private int[] stringToIntArray(String inputNumber) {

        int[] myNums;

        myNums = Stream.of(inputNumber.split("")).mapToInt(Integer::parseInt).toArray();

        return myNums;
    }

    private int checkStrike(int[] myNums, ArrayList<Integer> randomNums, int order) {

        if (myNums[order] == randomNums.get(order)) {

            return 1;
        }

        return 0;
    }

    private int checkBall(int[] myNums, ArrayList<Integer> randomNums, int order) {

        if (myNums[order] != randomNums.get(order) && randomNums.contains(myNums[order])) {

            return 1;
        }

        return 0;
    }

    public static class InputView {

        Scanner scanner = new Scanner(System.in);

        public int InputNumber() {

            System.out.println("숫자를 입력해 주세요 : ");
            return Integer.parseInt(scanner.nextLine());
        }
    }
}
