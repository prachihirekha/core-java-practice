package practice.ifcondition;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age..");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for the votes..!");
        }
        System.out.println("Not-Eligible for the votes...");
    }
}
