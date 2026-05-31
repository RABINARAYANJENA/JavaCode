package JavaPractice;
import java.util.*;
import java.util.Scanner;
public class LargeSmallElementArray
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
        int large=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        System.out.println("The large element is:"+large);
        int small=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println("The Small element is:"+small);
    }
}


