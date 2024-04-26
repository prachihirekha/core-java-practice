package practice.operators;

public class TernaryOperator {
    // conditional operator when we get a condition
    public static void main(String[] args) {
        int a=10,b=20,Max;
        int c=30;
        Max=(a>b) ? (a>c ?a:c): (b>c ? b:c);
        System.out.println(Max);
    }

}
