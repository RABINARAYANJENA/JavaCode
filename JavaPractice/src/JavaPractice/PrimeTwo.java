package JavaPractice;

import java.util.*;
class PrimeTwo
{
    static int c=0;
    int prime(int no)
    {
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        PrimeTwo ob=new PrimeTwo();
        int res=ob.prime(n);
         if(c==2)
        {
            System.out.println("The No is Prime");
        }
        else
        {
            System.out.println("The No is Not Prime");
        }
        
        
    }
}
