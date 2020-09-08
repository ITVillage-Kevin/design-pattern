package com.itvillage.template_method_pattern.step01;

public class DieselOwnerDriver {
    public void touchElectrostaticPad() {
        System.out.println("# 정전기 패드를 터치합니다.");
    }

    public void selectDiesel() {
        System.out.println("# 경유를 선택합니다.");
    }

    public void selectPayInFull() {
        System.out.println("# 일시불을 선택합니다.");
    }

    public void selectFillPartially() {
        System.out.println("# 일부만 넣기를 선택합니다.");
    }

    public void putCreditCard() {
        System.out.println("# IC 카드를 리더기에 삽입합니다.");
    }

    public void putNozzleInTheTank() {
        System.out.println("# 주유 탱크에 노즐을 집어 넣습니다.");
    }

    public void startFillUp() {
        System.out.println("# 기름을 넣습니다.");
    }

    public void pullOutNozzle() {
        System.out.println("# 주유 탱크에서 노즐을 뺍니다.");
    }

    public void pullOutCreditCard() {
        System.out.println("# IC 카드를 리더기에서 뺍니다");
    }

    public void getReceipt() {
        System.out.println("# 영수증을 받습니다.");
    }
}
