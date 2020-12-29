package lesson6.homework;

public class IOSPhone extends Phone {

    public IOSPhone(String vendor, String model) {
        super(vendor, model);
    }

    @Override
    public void installOS() {

    }

    @Override
    public void switchON() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void call(String countryPrefix, String operatorCode, String phoneNumber) {
        System.out.println("Phone "+getVendor() + " " + getModel() + " is calling "+countryPrefix + operatorCode + phoneNumber+"... ");
    }
}
