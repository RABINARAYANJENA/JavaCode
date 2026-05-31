package JavaPractice;

import java.util.*;

public class ReturnValue {

	int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int n1 = sc.nextInt();

		System.out.println("Enter the second number");
		int n2 = sc.nextInt();

		ReturnValue ob = new ReturnValue();

		int sum = ob.add(n1, n2);

		System.out.println("The Sum Of The No: " + sum);

	}
}
