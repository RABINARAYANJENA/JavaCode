package JavaPractice;
import java.util.*;

public class RevStringBuffer {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String name=sc.nextLine();
	StringBuffer sb=new StringBuffer(name);
	sb.reverse();
	System.out.println("The rev of the string is: "+sb);

	}

}
