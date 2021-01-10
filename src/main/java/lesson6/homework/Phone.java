package lesson6.homework;

public abstract class Phone {

    private String vendor;
    private String model;

    public Phone(String vendor, String model) {
            this.vendor = vendor;
            this.model = model;
    }


    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void installOS();


    public abstract void switchOn();


    public abstract void switchOff();


    public void call(PhoneNumber phoneNumber){
//            String countryPrefix, String operatorCode, String phoneNumber) {
//        System.out.println("Calling "+countryPrefix + operatorCode + phoneNumber+"... ");
    }

}
