package com.itvillage.template_method_pattern.step03;

public class DieselOwnerDriver extends OwnerDriver {
    @Override
    protected void selectFillType() {
        System.out.println("# 일부만 넣기를 선택합니다.");
    }

    @Override
    protected void selectPaymentType() {
        System.out.println("# 일시불을 선택합니다.");
    }

    @Override
    protected void selectOilType() {
        System.out.println("# 경유를 선택합니다.");
    }

}
