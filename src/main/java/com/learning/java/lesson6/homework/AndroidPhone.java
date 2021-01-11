package com.learning.java.lesson6.homework;

public class AndroidPhone extends Phone{

    public AndroidPhone(String vendor, String model){
        super(vendor, model);
    }
    @Override
    public void installOS() {

    }

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

//    @Override
//    public void call(String countryPrefix, String operatorCode, String phoneNumber) {
//        System.out.println("Phone "+getVendor() + " " + getModel() + " is calling "+countryPrefix + operatorCode + phoneNumber+"... ");
//    }
}
