package com.itvillage.template_method_pattern.step03.client;

import com.itvillage.template_method_pattern.step03.DieselOwnerDriver;
import com.itvillage.template_method_pattern.step03.GasolineOwnerDriver;
import com.itvillage.template_method_pattern.step03.OwnerDriver;

public class TemplateMethodClient {
    public static void main(String[] args) {
        OwnerDriver gasolineOwnerDriver = new GasolineOwnerDriver();
        gasolineOwnerDriver.processFillOil();

        System.out.println("===================================");

        OwnerDriver dieselOwnerDriver = new DieselOwnerDriver();
        dieselOwnerDriver.processFillOil();

    }
}
