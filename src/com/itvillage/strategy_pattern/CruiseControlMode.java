package com.itvillage.strategy_pattern;

public class CruiseControlMode implements DrivingMode {
    @Override
    public void setupDrivingMode() {
        System.out.println("# 크루즈 컨트롤 모드로 운행을 시작합니다.");
    }
}
