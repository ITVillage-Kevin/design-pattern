package com.itvillage.strategy_pattern;

public class AutomaticMode implements DrivingMode {
    @Override
    public void setupDrivingMode() {
        System.out.println("# 자동 모드로 운행을 시작합니다.");
    }
}
