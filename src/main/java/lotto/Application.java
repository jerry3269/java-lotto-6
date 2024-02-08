package lotto;

import lotto.controller.LotteryMachine;
import lotto.view.input.InputView;
import lotto.view.output.OutputView;

public class Application {
    public static void main(String[] args) {
        LotteryMachine lotteryMachine = new LotteryMachine(
                new OutputView(),
                new InputView()
        );

        lotteryMachine.startLottoGame();
    }
}
