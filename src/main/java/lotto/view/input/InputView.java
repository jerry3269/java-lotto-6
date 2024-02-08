package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public long readPurchaseAmount() {
        String stringPurchaseAmount = Console.readLine();
        return Long.parseLong(stringPurchaseAmount);
    }
}
