package baseballGame.controller;

import baseballGame.service.BallService;

import java.util.List;

public class BallsController {

    private final BallService ballService = new BallService();

    public List<Integer> createBalls() {

        return ballService.createBalls();
    }

}
