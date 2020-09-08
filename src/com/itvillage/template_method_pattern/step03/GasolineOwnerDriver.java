package com.itvillage.template_method_pattern.step03;

public class GasolineOwnerDriver extends OwnerDriver {

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


    boolean confirm() {
        // 실제로는 사용자가 입력을 받도록 한다.
        return false;
    }
}
