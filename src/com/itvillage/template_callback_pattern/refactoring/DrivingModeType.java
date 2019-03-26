package com.itvillage.template_callback_pattern.refactoring;

public enum DrivingModeType {
    MANUAL("수동 모드"),
    AUTOMATIC("자동 모드"),
    CRUISECONTROL("크루즈컨트롤 모드");

    private String modeName;

    DrivingModeType(String modeName) {
        this.modeName = modeName;
    }

    public String getModeName(){
        return modeName;
    }
}
