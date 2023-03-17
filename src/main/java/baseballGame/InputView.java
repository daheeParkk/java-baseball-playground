package baseballGame;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String inputBalls() {

        System.out.print("숫자를 입력해 주세요 : ");
        String inputBalls = scanner.nextLine();
        while (inputBalls.length() != 3) {

            System.out.println("숫자 3개를 다시 입력해 주세요");
            inputBalls = scanner.nextLine();
        }

        return inputBalls;
    }

    public void restart() {

        int restart = Integer.parseInt(scanner.nextLine());

        if (restart == 1) {
            Game baseballGame = new Game();
            baseballGame.playGame();
        }

    }
}
