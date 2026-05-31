package JavaPractice;

import java.util.*;
import java.util.Scanner;

class AccendingDecendingArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Element in to the array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Array Is:");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Performing Accending Sorting............");
		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < n - j - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		System.out.println("Array In Accending Order");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Performing Decending Sorting............");
		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < n - j - 1; i++) {
				if (a[i] < a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		System.out.println("Array In decending Order");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("Performing array reverse for original array ........");
		for (int i = 0; i < n / 2; i++) {
			int tmp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = tmp;
		}
		System.out.println("Array In original Order");
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
}
