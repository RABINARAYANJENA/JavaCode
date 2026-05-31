package JavaPractice;
import java.util.*;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String string=sc.nextLine();
		String str=string.toLowerCase();
		System.out.println("After converting LowerCase The String Is:"+ str);
		int i,c=0;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u' )
			{
				c++;
			}
		}
		System.out.println("The Total Number Of Vowel is: "+ c);

	}

}
