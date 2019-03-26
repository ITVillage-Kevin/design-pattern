package com.itvillage.template_callback_pattern.refactoring;

public class DrivingModeSetupTemplate {
    public String setup(DrivingMode drivingMode){
        return this.executeTemplate(drivingMode);
    }

    // Driving mode를 변경하기위한 Template
    private String executeTemplate(DrivingMode drivingMode){
        // 변하지 않는것. 즉, Template
        checkTirePressure();
        checkTemperatureInside();
        checkEngineOil();

        return drivingMode.setupDrivingMode(); // 변하는 것. 즉, Callback
    }

    private void checkEngineOil() {
        // 엔진 오일 체크
    }

    private void checkTemperatureInside() {
        // 실내 온도 측정
    }

    private void checkTirePressure() {
        // 타이어 공기압 체크
    }
}
