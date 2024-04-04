package practice.operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition :" +(a+b));
        System.out.println("Subtraction :" +(a-b));
        System.out.println("Multiplication:" +(a*b));
        System.out.println("division :" +(a/b));
        System.out.println("remainder :" +(a%b));
    }
}
