package JavaPractice;

import java.util.*;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		int no = n;
		int square = n * n;
		int sum = 0;

		while (square != 0) {

			int dig = square % 10;
			sum = sum + dig;
			square = square / 10;
		}

		if (sum == no) {
			System.out.println("The number is Neon");
		} else {
			System.out.println("The number is not Neon");
		}

		sc.close();
	}
}
