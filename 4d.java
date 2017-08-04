import java.util.*;
import java.lang.*;
import java.io.*;

class InsertS
{
	public static void main(String args[])
	{
		insertstring();
	}

	static void insertstring()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the total number of Strings");
		int n = sc.nextInt();
		String arr[]=new String[n];
		String key;
		int i,j;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		for( i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for( i=0;i<n;i++)
		{
			System.out.println("The sorted strings are : " + arr[i]);
		}
	}
}