package lotto.constant;

public enum ViewConstant {
    PURCHASE_AMOUNT_INPUT("구입 금액을 입력해 주세요."),
    PURCHASE_QUANTITY("개를 구매했습니다.");


    private String message;

    ViewConstant(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
