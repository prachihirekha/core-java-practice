package practice.basic.loop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
//        while (n>=0){
//            System.out.println("coding is going well");
//        }
        while(n<=10){
            System.out.println("coding");
           n++;
        }
    }
}
