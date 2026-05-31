package JavaPractice;
import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number range:");
		int n = sc.nextInt();

		int count = 0;
		int totalSum = 0;

		System.out.println("Valid DisariumNumbers are:");

		for (int j = 1; j <= n; j++) {

			int temp = j;
			int digits = 0;
			//count the number length
			while (temp != 0) {
				digits++;
				temp /= 10;
			}

			int no = j;
			int sum = 0;

			// calculate the DisariumNumber sum
			while (no != 0) {
				int digit = no % 10;
				sum += Math.pow(digit, digits);
				digits--;
				no /= 10;
			}

			if (sum == j) {
				System.out.println(j);
				count++;
				totalSum += j;
			}
		}

		System.out.println("Count = " + count);
		System.out.println("Sum = " + totalSum);

		sc.close();
	}
}