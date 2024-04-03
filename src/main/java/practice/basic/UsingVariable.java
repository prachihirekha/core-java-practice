package practice.basic;

public class UsingVariable {
    static int b =10;
    void fun(){
        int a =10;
        System.out.println(a+" "+b);
        // pre-increment
        ++a;
        ++b;// holding there memory;
    }

    public static void main(String[] args) {
        // create a object
        UsingVariable v = new UsingVariable();
        v.fun();
        v.fun();
    }
}
