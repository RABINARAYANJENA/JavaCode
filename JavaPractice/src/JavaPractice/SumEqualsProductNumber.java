package JavaPractice;
import java.util.Scanner;

public class SumEqualsProductNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number range:");
		int n = sc.nextInt();

		int count = 0;
		int totalSum = 0;

		System.out.println("Valid Numbers are:");

		for (int j = 1; j <= n; j++) {

			int temp = j;
			int digitSum = 0;
			int product = 1;
			while (temp != 0) {
				int digit = temp % 10;
				digitSum += digit;
				product *= digit;
				temp /= 10;
			}
			if (digitSum == product) {
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