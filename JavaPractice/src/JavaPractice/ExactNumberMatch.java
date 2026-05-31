package JavaPractice;

import java.util.*;

public class ExactNumberMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to guess:");
		int n = sc.nextInt();
		int input;
		while (n != 0) {
			System.out.println("Enter your guess:");
			input = sc.nextInt();

			if (input > n) {
				System.out.println("The number is greater");
			} else if (input < n) {
				System.out.println("The number is smaller");
			} else {
				System.out.println("The number is exact!");
				System.out.println("You guessed correctly!");
				break;
			}
		}
	}
}
