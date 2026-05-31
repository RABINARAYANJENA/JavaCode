package JavaPractice;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int original = n;
        int sum=0;
       for(int i=1;i<n;i++)
       {
           if(n%i==0)
           {
               sum+=i;
           }
       }
        System.out.println("The sum of the factorial is:"+sum);
        if (sum == original) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("The number is Not a perfect Number");
        }
    }
}