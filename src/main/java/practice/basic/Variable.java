package practice.basic;

public class Variable {
    static  int a =20;//Static variable
    int b =30;// instance variable;
    public static void main(String[] args) {
        int c =40;// local variable;s
        System.out.println(" instance variable:"+c);
        System.out.println("Static variable :"+a);
        // creat a object by using class name
        Variable v = new Variable();
        System.out.println(" instance variable"+v.b);

    }
}
