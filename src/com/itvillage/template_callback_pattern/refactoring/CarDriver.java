package com.itvillage.template_callback_pattern.refactoring;

public class CarDriver {
    public static void main(String[] args){
        Car car = new Car();

        car.startEngine();
        System.out.println();

        car.moveCar(DrivingModeType.AUTOMATIC);
        car.moveCar(DrivingModeType.CRUISECONTROL);

        System.out.println();
        car.stopEngine();
    }
}
