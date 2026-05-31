package JavaPractice;

import java.util.Scanner;

public class SumOfHarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int n = sc.nextInt();

        int grand = 0;

        System.out.println("The Harshad Numbers are:");

        for (int i = 1; i <= n; i++) {

            int temp = i;
            int sum = 0;

            while (temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            if (i % sum == 0) {
                System.out.println(i);
                grand += i;
            }
        }

        System.out.println("Sum of all Harshad Numbers: " + grand);

        sc.close();
    }
}