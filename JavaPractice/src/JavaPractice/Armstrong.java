package JavaPractice;

import java.util.*;
import java.lang.Math;

public class Armstrong {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int n = sc.nextInt();

		int no = n;
		int c = 0, rem;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			c++;
		}

		int l = c;

		System.out.println("The length of the number is : " + l);
		n = no;

		int arm = 0;
		while (n != 0) {
			int dig = n % 10;
			arm = arm + (int) Math.pow(dig, l);
			n = n / 10;
		}

		if (no == arm) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("The number is Not Armstrong");
		}
	}
}
