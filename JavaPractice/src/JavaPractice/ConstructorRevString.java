package JavaPractice;

import java.util.Scanner;

class ConstructorRevString {

	private String name;

	ConstructorRevString(String name) {
		this.name=name;
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println("The Reverse of The String Is: " + rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String name = sc.nextLine();
		new ConstructorRevString(name);

		sc.close();
	}
}