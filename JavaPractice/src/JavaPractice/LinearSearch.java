package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int key,i;
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element to the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array Is");
		System.out.print("[");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println("\n Enter the element you want to search");
		key=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("The element "+key+" is found at Index "+i);
				break;
			}
		}
		if(i==n)
		{
			System.out.println("The Element "+key+" Is Not Found");
		}
		
	}

}
