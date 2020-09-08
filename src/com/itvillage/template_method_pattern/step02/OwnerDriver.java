package com.itvillage.template_method_pattern.step02;

public abstract class OwnerDriver {
    public final void processFillOil() {
        touchElectrostaticPad();
        selectOilType();
        selectPaymentType();
        selectFillType();
        putCreditCard();
        putNozzleInTheTank();
        startFillUp();
        pullOutNozzle();
        pullOutCreditCard();
        getReceipt();

    }

    protected abstract void selectFillType();

    protected abstract void selectPaymentType();

    protected abstract void selectOilType();

    void touchElectrostaticPad() {
        System.out.println("# 정전기 패드를 터치합니다.");
    }
    void putCreditCard() {
        System.out.println("# IC 카드를 리더기에 삽입합니다.");
    }
    void putNozzleInTheTank() {
        System.out.println("# 주유 탱크에 노즐을 집어 넣습니다.");
    }
    void startFillUp() {
        System.out.println("# 기름을 넣습니다.");
    }
    void pullOutNozzle() {
        System.out.println("# 주유 탱크에서 노즐을 뺍니다.");
    }
    void pullOutCreditCard() {
        System.out.println("# IC 카드를 리더기에서 뺍니다");
    }
    void getReceipt() {
        System.out.println("# 영수증을 받습니다.");
    }
    void hook() {
        System.out.println("Owner hook");
    }
}
