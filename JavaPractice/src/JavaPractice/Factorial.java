package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int fact=1;
		while(no!=0)
		{
			fact=fact*no;
			no=no-1;
		}
		System.out.println("The Factorial Of the Number Is: "+fact);
		

	}

}
