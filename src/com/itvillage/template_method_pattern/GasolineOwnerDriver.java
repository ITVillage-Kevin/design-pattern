package com.itvillage.template_method_pattern;

public class GasolineOwnerDriver {
    public void touchElectrostaticPad() {
        System.out.println("# 정전기 패드를 터치합니다.");
    }

    public void selectGasoline() {
        System.out.println("# 휘발유를 선택합니다.");
    }

    public void selectInstallment() {
        System.out.println("# 할부를 선택합니다.");
    }

    public void selectFillFully() {
        System.out.println("# 가득 넣기를 선택합니다.");
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
        System.out.print("# 영수증을 받습니다.");
    }
}
