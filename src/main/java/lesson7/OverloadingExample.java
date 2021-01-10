package lesson7;

public class OverloadingExample {

    public static void main(String[] args) {

        int sum = OverloadingExample.sum(2, 3);
        System.out.println(sum);

        byte a1 = 4;
        byte a2 = 8;

        int sum2 = OverloadingExample.sum(a1, a2);
        System.out.println("sum2 = " + sum2);


    }

    public static int sum(byte a1, byte a2) {
        return a1 + a2;
    }

    public static int sum(int a1, int a2) {
        return a1 + a2;
    }

    public static long sum(long a1, long a2) {
        return a1 + a2;
    }
}
