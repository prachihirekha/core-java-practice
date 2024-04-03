package practice.basic.scanner;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the data");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a);
    }
}
