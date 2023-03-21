package baseballGame.view;

import baseballGame.result.Input;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String inputBalls() {

        System.out.print(Input.NUM);
        String inputBalls = scanner.nextLine();
        while (inputBalls.length() != 3) {

            System.out.println(Input.AGAIN);
            inputBalls = scanner.nextLine();
        }

        return inputBalls;
    }

    public int restart() {

        return Integer.parseInt(scanner.nextLine());
    }
}
