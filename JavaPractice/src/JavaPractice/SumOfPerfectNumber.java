package JavaPractice;

import java.util.Scanner;

public class SumOfPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number range:");
        int n = sc.nextInt();
        int count = 0;
        int grand=0;
        System.out.println("The Perfect Number are");
        for (int j = 1; j <= n; j++) 
        {
            int sum = 0;
            for (int i = 1; i < j; i++) {

                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.out.println(j);
                grand+=j;
                count++;
            }
        }
        System.out.println("Total perfect numbers in the range: " + count);
        System.out.println("The Sum Of the perfect number is : "+grand);
        sc.close();
    }
}