package JavaPractice;
import java.util.*;
import java.util.Scanner;
class Derived {
	Scanner sc=new Scanner(System.in);
	String rev="";
	void revstring()
	{
		System.out.println("Enter a String");
		String name=sc.nextLine();
		String nm=name;
		for(int i=name.length()-1;i>0;i--)
		{
			rev+=name.charAt(i);
		}
		System.out.println("The Reverse Of the String Is: "+rev);
		if(rev==nm)
		{
			System.out.println("The String Is Pallindrome");
		}
		else
		{
			System.out.println("The String is Not Pallindrome");
		}
		
	}
	void revinteger()
	{
		int no,no1,dig,reverse=0;
		System.out.println("Enter the number");
		no=sc.nextInt();
		no1=no;
		while(no!=0)
		{
			dig=no%10;
			reverse=reverse*10+dig;
			no=no/10;
			
		}
		System.out.println("The Reverse Of the Number Is: "+reverse);
		if(no1==reverse)
		{
			System.out.println("The Integer Is Pallindrome");
		}
		else
		{
			System.out.println("The Integer is Not Pallindrome");
		}
	}

}
public class Pallindrome 
{
	public static void main(String args[])
	{
		Derived ob= new Derived();
		ob.revstring();
		ob.revinteger();
	}
}
	


