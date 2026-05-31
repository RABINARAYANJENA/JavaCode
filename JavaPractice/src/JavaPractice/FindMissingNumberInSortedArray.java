package JavaPractice;

import java.util.Scanner;

class FindMissingNumberInSortedArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the Elements Into The Array");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The Array Is");

        System.out.print("[");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("]");
        System.out.println("Performing bubble sort");
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
        System.out.println("After sorting the array");
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("The Missing Elements Are:");

        for (int i = 0; i < n - 1; i++) {

            int diff = a[i + 1] - a[i];

            if (diff > 1) {

                for (int j = 1; j < diff; j++) {
                    System.out.println(a[i] + j);
                }
            }
        }

        sc.close();
    }
}