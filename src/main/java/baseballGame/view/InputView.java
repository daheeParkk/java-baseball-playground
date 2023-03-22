package baseballGame.view;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;
import baseballGame.service.InputService;
import baseballGame.ui.Input;

import java.util.Scanner;

public class InputView {

    private static String inputBalls;
    private static String isRestart;
    private final InputService inputService = new InputService();
    Scanner scanner = new Scanner(System.in);
    private boolean correctInput = false;

    public String inputBalls() {

        System.out.print(Input.NUM.getMessage());

        while (!correctInput) {

            try {
                inputBalls = scanner.nextLine();
                inputService.checkCollect(inputBalls);
                correctInput = true;
            } catch (WrongLength | DuplicateNumber | NotNumber ex) {
                System.out.print(ex.getMessage() + "\n");
                System.out.println(Input.AGAIN.getMessage());
            }
        }

        correctInput = false;

        return inputBalls;
    }

    public int restart() {

        while (!correctInput) {

            try {
                isRestart = scanner.nextLine();
                inputService.checkOneTwo(isRestart);
                correctInput = true;
            } catch (NotOneTwo | NotNumber ex) {
                System.out.print(ex.getMessage() + "\n");
                System.out.print(Input.AGAIN_ONE_TWO.getMessage());
            }
        }

        correctInput = false;

        return Integer.parseInt(isRestart);
    }
}
