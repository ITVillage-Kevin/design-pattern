package com.itvillage.strategy_pattern;

public class CarDriver {
    public static void main(String[] args){
        Car car = new Car();
        car.startEngine();
        System.out.println();

        // 자동 모드 운전
        DrivingMode automaticMode = new AutomaticMode(); // 자동 모드 전략
        car.moveCar(automaticMode);

        // 크루즈 컨트롤 운전
        DrivingMode cruiseControlMode = new CruiseControlMode(); // 크루즈 컨트롤 모드 전략
        car.moveCar(cruiseControlMode);

        System.out.println();
        car.stopEngine();
    }
}
