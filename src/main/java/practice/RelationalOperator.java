package practice;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the Num ..");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("true/false ="+(a<b));
        System.out.println("true/false ="+(a>b));
        System.out.println("true/false ="+(a<=b));
        System.out.println("true/false ="+(a>=b));
        System.out.println("true/false ="+(a==b));
        System.out.println("true/false ="+(a!=b));
    }
}
