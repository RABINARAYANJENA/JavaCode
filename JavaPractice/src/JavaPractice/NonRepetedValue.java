package JavaPractice;

import java.util.Scanner;

public class NonRepetedValue {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the Elements Into The Array");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The Array Is");

		System.out.print("[");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("]");

		System.out.println("Non-Repeated Elements Are:");

		for (int i = 0; i < n; i++) {

			int count = 0;

			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.println(a[i]);
			}
		}

		sc.close();
	}
}
