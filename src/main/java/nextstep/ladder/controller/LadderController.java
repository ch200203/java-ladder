package nextstep.ladder.controller;

import nextstep.ladder.view.InputView;

public class LadderController {

    public static void run() {
        InputView inputView = new InputView();
        inputView.inputNames();
        inputView.inputHeight();
    }
}
