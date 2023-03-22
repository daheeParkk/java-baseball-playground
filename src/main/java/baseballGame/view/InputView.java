package baseballGame.view;

import baseballGame.exception.DuplicateNumber;
import baseballGame.exception.NotNumber;
import baseballGame.exception.WrongLength;
import baseballGame.service.InputService;
import baseballGame.ui.Input;

import java.util.Scanner;

public class InputView {

    private final InputService inputService = new InputService();
    Scanner scanner = new Scanner(System.in);
    private static String inputBalls;

    public String inputBalls() {

        boolean correctInput = false;
        System.out.print(Input.NUM.getMessage());

        while (!correctInput) {

            try {
                inputBalls = scanner.nextLine();
                inputService.checkCollect(inputBalls);
                correctInput = true;
            } catch (WrongLength | DuplicateNumber | NotNumber ex) {
                System.out.print(ex.getMessage()+"\n");
                System.out.println(Input.AGAIN.getMessage());
            }
        }

        return inputBalls;
    }

    public int restart() {

        return Integer.parseInt(scanner.nextLine());
    }
}
