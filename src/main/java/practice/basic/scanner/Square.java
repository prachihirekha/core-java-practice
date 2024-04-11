package practice.basic.scanner;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int side;
        System.out.println("enter the side");
        Scanner sc = new Scanner(System.in);
       side =sc.nextInt();
        System.out.println("Area of square = "+(side*side)+ "\n Area of perimeter = "+(4*side));
    }
}
