package practice.basic.scanner;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two number....");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum of Two number = "+(a+b));
    }
}
