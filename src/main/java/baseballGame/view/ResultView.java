package baseballGame.view;

import baseballGame.dto.BallAndStrike;
import baseballGame.service.ResultService;

import java.util.List;

public class ResultView {

    private int numOfBall;
    private int numOfStrike;

    public Boolean resultOutput(BallAndStrike result) {

        ResultService resultService = new ResultService();
        List<Integer> ballAndStrike = result.getBallAndStrike();

        numOfBall = ballAndStrike.get(0);
        numOfStrike = ballAndStrike.get(1);

        Boolean isThreeStrike = resultService.separationOfAnswer(result);

        if (isThreeStrike) {

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        return false;
    }

    public void nothing() {

        System.out.print("낫싱\n");
    }

    public void ball() {

        System.out.print(numOfBall + "볼\n");
    }

    public void strike() {

        System.out.print(numOfStrike + "스트라이크\n");
    }

    public void ballStrike() {

        System.out.print(numOfBall + "볼 " + numOfStrike + "스트라이크\n");
    }
}
