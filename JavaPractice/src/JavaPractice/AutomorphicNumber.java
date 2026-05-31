package JavaPractice;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int lastDigits = square % (int)Math.pow(10, digits);
        System.out.println("Square of number is: " + square);
        System.out.println("Last digits of square: " + lastDigits);
        if (n == lastDigits) 
        {
            System.out.println("The number is an Automorphic Number");
        } else 
        {
            System.out.println("The number is NOT an Automorphic Number");
        }
    }
}