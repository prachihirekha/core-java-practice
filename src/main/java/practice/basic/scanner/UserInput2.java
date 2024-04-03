package practice.basic.scanner;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        int a ;
        System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);
       a= sc.nextInt();
       int b = sc.nextInt();
        System.out.println(a+ " "+ b);
    }
}

