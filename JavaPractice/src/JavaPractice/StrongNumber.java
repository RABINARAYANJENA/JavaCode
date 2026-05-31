package JavaPractice;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0)
        {
            int dig = n % 10;
            int fact = 1;
            while (dig != 0) 
            {
                fact = fact * dig;
                dig--;
            }
            sum = sum + fact;
            n = n / 10;
        }
        System.out.println("The sum of the factorial is:"+sum);
        if (sum == original) {
            System.out.println("The number is Strong Number");
        } else {
            System.out.println("The number is Not Strong Number");
        }
    }
}