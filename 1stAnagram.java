import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram
{	
	Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
	
		Anagram a1 = new Anagram();
		a1.checkAna();

	}

	String a,b;
	void checkAna()
	{
		a=sc.next();
		b=sc.next();
		char []t1 =a.toCharArray();
		char []t2=b.toCharArray();
		Arrays.sort(t1);
		String str1 = String.valueOf(t1);
		//System.out.println(t1);
		Arrays.sort(t2);
		String str2=String.valueOf(t2);
		//System.out.println(t2);
		boolean ab= str1.equals(str2);
		System.out.println(ab);
		if(ab)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}

}