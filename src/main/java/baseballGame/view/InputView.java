package baseballGame.view;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.NotOneTwo;
import baseballGame.exception.WrongLength;
import baseballGame.service.InputService;
import baseballGame.utils.Input;

import java.util.Scanner;

import static baseballGame.utils.Input.*;

public class InputView {

    private String inputBalls;
    private String isRestart;
    private final InputService inputService = new InputService();
    private final Scanner scanner = new Scanner(System.in);
    private boolean correctInput = false;

    public String inputBalls() {

        System.out.print(NUM.getMessage());

        while (!correctInput) {

            try {
                inputBalls = scanner.nextLine();
                inputService.checkCollect(inputBalls);
                correctInput = true;
            } catch (WrongLength | DuplicateNumber | NotNumber ex) {
                System.out.print(ex.getMessage() + "\n");
                System.out.println(AGAIN.getMessage());
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
                System.out.print(AGAIN_ONE_TWO.getMessage());
            }
        }

        correctInput = false;

        return Integer.parseInt(isRestart);
    }
}
