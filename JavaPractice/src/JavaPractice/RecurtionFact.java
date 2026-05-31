package JavaPractice;

import java.util.Scanner;

class Main {

    static int factorial(int no) {
        int fact = 1;

        while (no != 0) {
            fact = fact * no;
            no--;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);
    }
}
