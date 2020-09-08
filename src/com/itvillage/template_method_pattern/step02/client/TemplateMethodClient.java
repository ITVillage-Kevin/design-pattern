package com.itvillage.template_method_pattern.step02.client;

import com.itvillage.template_method_pattern.step02.DieselOwnerDriver;
import com.itvillage.template_method_pattern.step02.GasolineOwnerDriver;
import com.itvillage.template_method_pattern.step02.OwnerDriver;

public class TemplateMethodClient {
    public static void main(String[] args) {
        OwnerDriver gasolineOwnerDriver = new GasolineOwnerDriver();
        gasolineOwnerDriver.processFillOil();

        System.out.println("===================================");

        OwnerDriver dieselOwnerDriver = new DieselOwnerDriver();
        dieselOwnerDriver.processFillOil();

    }
}
