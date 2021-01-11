package com.learning.java.lesson6.homework;

public class PhoneNumber {

    public String countryPrefix;
    public String operatorCode;
    public String phoneNumber;

    public PhoneNumber(String countryPrefix, String operatorCode, String phoneNumber) {
        this.countryPrefix = countryPrefix;
        this.operatorCode = operatorCode;
        this.phoneNumber = phoneNumber;
    }

    public String toCallingNumber(){
        return countryPrefix+operatorCode+phoneNumber;
    }
//    public void mobilePhoneNumber() {
//        System.out.println(countryPrefix + operatorCode + phoneNumber);
//    }

}
