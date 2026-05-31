package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class ArrayDeclare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element to the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array Is");
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}

}
