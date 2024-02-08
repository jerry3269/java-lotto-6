package lotto.view.output;

import static lotto.constant.ViewConstant.PURCHASE_AMOUNT_INPUT;
import static lotto.constant.ViewConstant.PURCHASE_QUANTITY;

public class OutputView {
    public void printPurchaseAmountPrompt() {
        System.out.println(PURCHASE_AMOUNT_INPUT.message());
    }

    public void printNewLine() {
        System.out.println();
    }

    public void printPurchaseQuantity(long purchaseAmount) {
        System.out.println(purchaseAmount / 1000 + PURCHASE_QUANTITY.message());
    }
}
