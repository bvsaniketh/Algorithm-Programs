import java.util.*;
import java.lang.*;
import java.io.*;

class BubbleS
{
	public static void main(String args[])
	{
		
		bubblesearch();	//convert to character array of the string
		

	}

	static void bubblesearch()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of Strings");
		int n = sc.nextInt();
		String arr[]=new String[n];
		String temp;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);

	}
}