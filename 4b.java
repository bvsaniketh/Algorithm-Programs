import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryS
{
	public static void main(String args[])
	{
		
		bsearch();	//convert to character array of the string
		

	}
	static void bsearch()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Strings");
		int n=sc.nextInt();
		
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}

		System.out.println("Enter the key to search");
		String key1=sc.next();
		int l=0,m,h=n-1;
		int flag=0;
		m=(l+h)/2;
		for(int i=0;i<n;i++)
		{
		while(l<=h)
		{
		
		if(key1.compareTo(arr[m])>0 )
		{
			l=m+1;


		}
		else if(arr[m].equals(key1))
		{

		//System.out.println("Key found at positon" + m);
			flag=1;

			break;
		}
		else if(key1.compareTo(arr[m])<0)
		{
			h=m-1;
		}
		m=(l+h)/2;
		}
		
		}
		if(flag==1)
		System.out.println("Key found at positon" + m);
		 else
		System.out.println("Key not found at any positon");
		
	}

}
