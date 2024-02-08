package lotto.controller;

import lotto.view.input.InputView;
import lotto.view.output.OutputView;

public class LotteryMachine {
    private final OutputView outputView;
    private final InputView inputView;

    public LotteryMachine(
            OutputView outputView,
            InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void startLottoGame() {
        //구입 금액 입력 기능
        outputView.printPurchaseAmountPrompt();
        long purchaseAmount = inputView.readPurchaseAmount();
        outputView.printNewLine();
        outputView.printPurchaseQuantity(purchaseAmount);
    }
}
