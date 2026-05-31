package JavaPractice;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int no=n;
        int sum=0,dig=0;
        while(no!=0)
        {
            dig=no%10;
            sum+=dig;
            no=no/10;
        }
        System.out.println("The Sum Of The Number Is:"+sum);
        if (n%sum==0) 
        {
            System.out.println("The number is Harshad Number");
        } else 
        {
            System.out.println("The number is NOT Harshad Number");
        }
    }
}
