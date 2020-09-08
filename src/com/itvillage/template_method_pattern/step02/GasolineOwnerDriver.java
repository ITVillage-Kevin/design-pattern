package com.itvillage.template_method_pattern.step02;

public class GasolineOwnerDriver extends OwnerDriver{

    @Override
    protected void selectFillType() {
        System.out.println("# 가득 넣기를 선택합니다.");
    }

    @Override
    protected void selectPaymentType() {
        System.out.println("# 할부를 선택합니다.");
    }

    @Override
    protected void selectOilType() {
        System.out.println("# 휘발유를 선택합니다.");
    }


    void hook() {
        System.out.println("Gasoline hook");
    }
}
