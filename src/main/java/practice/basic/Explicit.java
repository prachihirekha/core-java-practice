package practice.basic;
// explicit type casting
public class Explicit {
    public static void main(String[] args) {
        double x = 10.5;// 8byte
        int y= (int) x;// 4 byte
        System.out.println(y);
    }
}
