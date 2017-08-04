import java.util.*;
import java.lang.*;
import java.io.*;

class Temp
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the temperature to be checked in c or f");
		char t1=sc.next().charAt(0);

		tempc(t1);
	}
	static void tempc(char t1)
	{	
		Scanner sc =new Scanner(System.in);
		float tot;

		switch (t1)
		{
			case 'c':
			case 'C':
			System.out.println("Enter the celsius temperature now :");
			float cel=sc.nextFloat();
			tot=((cel*((float)9/5))+32);
			System.out.println("The temperature in Farenheit is :" + tot);
			break;

			case 'f':
			case 'F':
			System.out.println("Enter the far temperature now :");
			float far=sc.nextFloat();
			tot= ((float)(far-32)* ((float)5/9));
			System.out.println("The temperature in cel is :" + tot);
			break;


		}
	}
}