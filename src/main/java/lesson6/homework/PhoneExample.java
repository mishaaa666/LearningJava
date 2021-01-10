package lesson6.homework;

public class PhoneExample {
    public static void main(String[] args) {
        Phone firstPhone = new IOSPhone("iPhone", "XR");
        Phone secondPhone = new AndroidPhone("Samsung", "S9");

        PhoneNumber phoneNumber = new PhoneNumber("+93", "796", "1234567");
        PhoneNumber phoneNumber2 = new PhoneNumber("+38", "063", "1234567");


        firstPhone.installOS();
        firstPhone.switchOn();
        firstPhone.call(phoneNumber);
        firstPhone.switchOff();


        secondPhone.installOS();
        secondPhone.switchOn();
        secondPhone.call(phoneNumber2);
        secondPhone.switchOff();
    }


}
