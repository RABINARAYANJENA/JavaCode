package JavaPractice;

import java.util.Scanner;
public class ReverseNumRecurtion {

	 static int reversenum(int no) {
	        int rev = 0;
	        int dig;

	        while (no != 0) {
	            dig =no%10;
	            rev=rev*10+dig;
	            no=no/10;
	        }

	        return rev;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number");
	        int n = sc.nextInt();

	        int result = reversenum(n);

	        System.out.println("Reverse = " + result);
	    }
}

