package practice.ifcondition;

import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number..");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if(n>=0){
            System.out.println("+ve Number...");
        }
        else {
            System.out.println("-ve Number...");
        }
    }
}

