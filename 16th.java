import java.util.*;
import java.io.*;
import java.lang.*;

class ToBinary2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str1=Utility.binarycon(n);
		System.out.println(str1);
		splitB(str1);

	}
	static void splitB(String str1)
	{
		String sub1,sub2,final1;
		int final2;
		int sum=0,rem=0;
		int flag1=0;
		sub1=str1.substring(0,4);
		sub2=str1.substring(4,8);
		final1=sub2+sub1;
		System.out.println("After Nibble swapping" + final1);
		final2=Integer.parseInt(final1);
		while(final2>0)
		{
			
			rem=(final2%10);
			sum=sum+(int)(rem*Math.pow(2,flag1++));
			final2/=10;
				
		}
		System.out.println("The decimal value after swapping" + " " + sum );


	}
}