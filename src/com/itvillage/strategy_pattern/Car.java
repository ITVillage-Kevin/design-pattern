package com.itvillage.strategy_pattern;

public class Car {
    public void startEngine(){
        // 엔진 start
        System.out.println("==== Engine start! ====");
    }

    public void stopEngine(){
        // 엔진 stop
        System.out.println("==== Engine stop! ====");
    }
    public void moveCar(DrivingMode drivingMode){
        checkTirePressure();
        checkTemperatureInside();
        checkEngineOil();

        drivingMode.setupDrivingMode();
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
