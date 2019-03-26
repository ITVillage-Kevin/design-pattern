package com.itvillage.template_callback_pattern.refactoring;

public class Car {
    public void startEngine(){
        // 엔진 start
        System.out.println("==== Engine start! ====");
    }

    public void stopEngine(){
        // 엔진 stop
        System.out.println("==== Engine stop! ====");
    }

    public void moveCar(final DrivingModeType drivingModeType){
        DrivingMode drivingMode = () -> drivingModeType.getModeName();

        DrivingModeSetupTemplate template = new DrivingModeSetupTemplate();
        String drivingModeName = template.setup(drivingMode);

        System.out.println(drivingModeName + "로 운행합니다.");
    }
}
