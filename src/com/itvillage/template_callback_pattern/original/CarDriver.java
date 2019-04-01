package com.itvillage.template_callback_pattern.original;

public class CarDriver {
    public static void main(String[] args){
        Car car = new Car();
        car.startEngine();
        System.out.println();

        DrivingMode automaticMode = new DrivingMode() {
            @Override
            public void setupDrivingMode() {
                System.out.println("# 자동 모드로 운행을 시작합니다.");
            }
        };

        car.moveCar(automaticMode);

        car.moveCar(new DrivingMode() {
            @Override
            public void setupDrivingMode() {
                System.out.println("# 크루즈 컨트롤 모드로 운행을 시작합니다.");
            }
        });


        System.out.println();
        car.stopEngine();
    }
}
