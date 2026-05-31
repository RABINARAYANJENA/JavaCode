package JavaPractice;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Range ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);

		}
	}

}
