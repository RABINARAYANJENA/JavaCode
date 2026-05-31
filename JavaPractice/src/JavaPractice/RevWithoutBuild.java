package JavaPractice;

import java.util.Scanner;

public class RevWithoutBuild {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String Name = sc.nextLine();
		String rev="";
		for(int i = Name.length()-1;i>=0;i--)
		{
			rev+=Name.charAt(i);
		}
		System.out.println("The Reverse OF a String Is: "+rev);
		}
			
		
	}


