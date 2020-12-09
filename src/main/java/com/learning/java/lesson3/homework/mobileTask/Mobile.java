package com.learning.java.lesson3.homework.mobileTask;

public class Mobile {
    //fields
    public String mobileVendor;
    public String model;
    public String productionYear;
    public String screenSize;
    public String processor;
    public int numberOfCores;
    public int numberOfCameras;
    public String cameraFeatures;
    public int ram;
    public int rom;
    public String operatingSystem;
    public String batteryType;

    //constructors
    public Mobile(String mobileVendor, String model, String productionYear, String screenSize,
                  String processor, int numberOfCores, int numberOfCameras, String cameraFeatures,
                  int ram, int rom, String operatingSystem, String batteryType) {
        this.mobileVendor = mobileVendor;
        this.model = model;
        this.productionYear = productionYear;
        this.screenSize = screenSize;
        this.processor = processor;
        this.numberOfCores = numberOfCores;
        this.numberOfCameras = numberOfCameras;
        this.cameraFeatures = cameraFeatures;
        this.ram = ram;
        this.rom = rom;
        this.operatingSystem = operatingSystem;
        this.batteryType = batteryType;


    }

    //methods
    public void printMobileProduction() {
        System.out.println("Phone Name: " + mobileVendor + model + productionYear);
    }

    public void printMainCharacteristics() {
        System.out.println("Main characteristics: Screen Size - " + screenSize + ". Processor Type - " + processor + " "
                + numberOfCores + " cores. Operating System - " + operatingSystem + ". RAM - " + ram + ". ROM - " + rom
                + ". Battery Type - " + batteryType + ".");
    }


    public void printCameraFeatures() {
        System.out.println("Camera Features: Number of Cameras - " + numberOfCameras + ". Camera resolution - " + cameraFeatures + ".");
    }
}

