package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class MinNumber  {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter the element to the array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array Is");
		System.out.print("[");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		int min = a[0];
	
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("The Smallest Element Is: "+min);
		System.out.print("The Second Smallest Element Is: "+a[n-(n-1)]);
		
	}
}


