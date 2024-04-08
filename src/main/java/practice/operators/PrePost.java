package practice.operators;

public class PrePost {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a);
        System.out.println(
                "prePost Incr...."
        );
        System.out.println(a++);
        System.out.println(++a);

        System.out.println(
                "prePost Decr...."
        );
        System.out.println(a--);
        System.out.println(--a);
    }
}
