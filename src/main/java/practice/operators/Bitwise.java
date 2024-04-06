package practice.operators;

public class Bitwise {
    public static void main(String[] args) {
        int a =5, b =7;
        System.out.println("And "+ (a&b));
        System.out.println("Or "+(a|b));
        System.out.println("Xor "+(a^b));
        System.out.println("complement "+(~a));
    }
}
