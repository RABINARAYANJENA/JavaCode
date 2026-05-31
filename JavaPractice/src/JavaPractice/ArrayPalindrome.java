package JavaPractice;
import java.util.*;
//import java.util.Scanner;

public class ArrayPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size Of the Array");
		int n = sc.nextInt();

		int a[] = new int[n];
		int i;

		System.out.println("Enter the Elements To the Array");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The Array Is");
		System.out.print("[ ");
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");

		int b[] = new int[n];

		for (i = 0; i < n; i++) {
			b[i] = a[i];
		}

		System.out.println("Successfully copied the array");
		System.out.print("[ ");
		for (i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

		System.out.println("Performing reverse array");

		for (i = 0; i < n / 2; i++) {
			int temp = b[i];
			b[i] = b[n - 1 - i];
			b[n - 1 - i] = temp;
		}

		System.out.print("[ ");
		for (i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");

		int c = 0;

		for (i = 0; i < n; i++) {
			if (b[i] == a[i]) {
				c++;
			}
		}

		if (c == n) {
			System.out.println("The array is palindrome");
		} else {
			System.out.println("The array is not palindrome");
		}

		sc.close();
	}
}