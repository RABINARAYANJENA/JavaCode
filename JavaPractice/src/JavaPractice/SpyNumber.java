package JavaPractice;

import java.util.Scanner;

public class SpyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int no=n;
        int sum=0,dig=0,product=1;
        while(no!=0)
        {
            dig=no%10;
            sum+=dig;
            product*=dig;
            no=no/10;
        }
        System.out.println("The Sum Of The Number Is:"+sum);
        System.out.println("The Product Of The Number Is:"+product);
        if (sum==product) 
        {
            System.out.println("The number is Spy Number");
        } else 
        {
            System.out.println("The number is NOT Spy Number");
        }
    }
}