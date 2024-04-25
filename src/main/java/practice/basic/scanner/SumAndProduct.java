package practice.basic.scanner;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the number..");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        int z= a+b;
        int s=a*b;
        System.out.println("Sum of numbers = "+z);
        System.out.println("Product of numbers ="+ s);
    }
}
