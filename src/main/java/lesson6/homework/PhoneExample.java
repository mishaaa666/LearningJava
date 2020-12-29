package lesson6.homework;

public class PhoneExample {
    public static void main(String[] args) {
        Phone firstPhone = new IOSPhone("iPhone", "XR");
        Phone secondPhone = new AndroidPhone("Samsung", "S9");



        firstPhone.installOS();
        firstPhone.switchON();
        firstPhone.call("+38", "063", "1234567");
        firstPhone.switchOff();


        secondPhone.installOS();
        secondPhone.switchON();
        secondPhone.call("+93", "796", "1234567");
        secondPhone.switchOff();
    }


}
