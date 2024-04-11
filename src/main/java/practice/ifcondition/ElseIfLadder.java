package practice.ifcondition;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter the Marks");
        Scanner sc = new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>80){
            System.out.println("topper");
        } else if (marks<80 && marks>=60) {
            System.out.println("first");
        }else {
            System.out.println("last");
        }
    }
}
