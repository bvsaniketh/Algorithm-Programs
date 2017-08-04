import java.util.*;
import java.lang.*;
import java.io.*;

class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,flag=0;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{	flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
			{	flag=1;
				break;
			}
			}
			if(flag==0)
			System.out.println(i);
		}

	}
}