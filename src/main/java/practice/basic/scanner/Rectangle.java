package practice.basic.scanner;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
       double a,b;
        System.out.println("Enter number..");
        Scanner sc =new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        double v = a * b;
        double rectangle = 2 *v;
        System.out.println("Area of rectangle"+rectangle);
    }
}
