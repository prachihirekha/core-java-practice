package practice.basic.scanner;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        String name;
        System.out.println("Enter the name...");
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter the rollNumber..");
        int rollNo;
        rollNo=sc.nextInt();
        System.out.println("Enter the field of interest...");
        String fieldOfInterest;
             fieldOfInterest= sc.next();
        System.out.println(name+" "+rollNo +" "+ fieldOfInterest);

    }
}
