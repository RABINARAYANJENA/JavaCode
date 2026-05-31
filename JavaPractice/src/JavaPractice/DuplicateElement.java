package JavaPractice;

import java.util.*;
import java.util.Scanner;

class DuplicateElement {
	public static void main(String args[]) {
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the Elements Into The Array");

		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The Array Is");

		System.out.print("[");

		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("]");
		System.out.println();

		System.out.println("The Duplicate Elements are");

		for (i = 0; i < n; i++) {
			int c = 1;

			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					c++;
				}
			}
			boolean alreadyPrinted = false;

			for (int k = 0; k < i; k++) {
				if (a[k] == a[i]) {
					alreadyPrinted = true;
					break;
				}
			}

			if (c > 1 && !alreadyPrinted) {
				System.out.println(a[i] + " - " + c + " times");
			}
		}
	}
}