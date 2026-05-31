package JavaPractice;
import  java.util.*;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element to the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array is");
		System.out.print("[");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("]\n");
		System.out.println("Performing Sorting");
		for(j=0;j<n-1;j++)
		{
			for(i=0;i<n-j-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println("After Sorting The Array");
		System.out.print("[");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("]\n");
		System.out.println("Reverse the array");
		for(i=0;i<n/2;i++)
		{
			int tmp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=tmp;
			
		}
		System.out.println("After Reverse The array");
		System.out.print("[");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("]");
		
		
		
		
		

	}

}
