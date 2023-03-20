package baseballGame.view;

public class ResultView {

    public Boolean hintOutput(int[] result) {

        int numOfBall = result[0];
        int numOfStrike = result[1];

        Boolean isThreeStrike = separationOfAnswer(numOfBall, numOfStrike);

        if (isThreeStrike) {

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        return false;
    }

    private Boolean separationOfAnswer(int ball, int strike) {

        if (ball == 0 && strike == 0) {

            System.out.print("낫싱\n");
            return false;
        }
        if (ball != 0 && strike == 0) {

            System.out.print(ball + "볼\n");
            return false;
        }
        if (ball == 0) {

            System.out.print(strike + "스트라이크\n");
            return checkAnswer(strike);
        }
        System.out.print(ball + "볼 " + strike + "스트라이크\n");
        return false;
    }

    private Boolean checkAnswer(int strike) {

        return strike == 3;
    }
}
