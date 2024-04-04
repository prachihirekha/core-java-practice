package practice.operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("Logical And");
        System.out.println((10>5)&&(2>1));
        System.out.println((10>5)&&(2<1));
        System.out.println((10<5)&&(2<1));

        System.out.println("Logical or");
        System.out.println((10>5)||(2>1));
        System.out.println((10>5)||(2<1));
        System.out.println((10<5)||(2<1));

        System.out.println("Logical Not");
        System.out.println(!(10>5));
        System.out.println(!(10<5));
        System.out.println(!(10==5));

    }
}
