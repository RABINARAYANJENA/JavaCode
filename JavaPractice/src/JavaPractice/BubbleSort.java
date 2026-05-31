package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class BubbleSort  {

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
		System.out.print("]\n");
		System.out.println("After Sorting The Array Is");
		for(int j=0;j<n-1;j++)
		{
			for(int i=0;i<n-j-1;i++)
			{
				if (a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}


