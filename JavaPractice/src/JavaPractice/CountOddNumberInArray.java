package JavaPractice;

import java.util.*;
import java.util.Scanner;
public class CountOddNumberInArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of the Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Element To the Array");
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
        System.out.println();
        System.out.println("Performing BubbleSort");
        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-j-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        System.out.println("After BubbleSort The Array is");
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Performing count of all even element");
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        System.out.println("The the even number are present in the Array Is: "+c);
        System.out.println("Performing count of all Odd element");
        c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                c++;
            }
        }
        System.out.println("The the even number are present in the Array Is: "+c);
    }
}

