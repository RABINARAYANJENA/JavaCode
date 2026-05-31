package JavaPractice;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, c = 0;

        System.out.println("Enter the Number");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("The Number Is Prime");
        } else {
            System.out.println("The Number Is Not Prime");
        }

    }
}