import java.util.*;
import java.lang.*;
import java.io.*;

public final class Utility
{
	private Utility()
	{

	}	



public static void bini(int arr[],int l,int m,int h,int n)
	{
		Scanner sc = new Scanner(System.in);
		Arrays.sort(arr);
		int flag=0;

		l=0;
		h=n-1;
		m=(l+h)/2;
		System.out.println("Enter the value of the key to search for");
		int key =sc.nextInt();
		
		
			
		while(l<h)
			{
			if(arr[m]<key)
			{
				l=m+1;	
			}
			else if(arr[m]==key)
			{	
				flag=1;
				break;
			}
			else if(arr[m]>key)
			{
				h=m-1;
			}
			m=(l+h)/2;
			}
			if(flag==1)
		System.out.println("Key found at " + m);
		else
		System.out.println("Key not found at all ");

		}


public static int bsearch(String str[],String key)
	{
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the number of Strings");
		// int n=sc.nextInt();
		int n=0;
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str[i];
		}
		// for(int i=0;i<n;i++)
		// {
		// 	arr[i]=sc.next();
		// }

		System.out.println("Enter the key to search");
		// String key1=sc.next();
		int l=0,m,h=n-1;
		int flag=0;
		m=(l+h)/2;
		for(int i=0;i<n;i++)
		{
		while(l<=h)
		{
		
		if(key.compareTo(arr[m])>0 )
		{
			l=m+1;


		}
		else if(arr[m].equals(key))
		{

		//System.out.println("Key found at positon" + m);
			flag=1;

			break;
		}
		else if(key.compareTo(arr[m])<0)
		{
			h=m-1;
		}
		m=(l+h)/2;
		}
		
		}
		if(flag==1)
		{
			System.out.println("Key found at positon" + m);
		 	return 1;
		 	break;
		}
		else
		{
			System.out.println("Key not found at any positon");
			return -1;
		}
	}



public static void InsertI(int arr[],int n)
	{
		int key,i,j;
		for(i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for( i=0;i<n;i++)
		{
			System.out.println("The sorted array is : " + arr[i]);
		}
	}

public static void insertstring()
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

public static void bubbleI(int arr[],int n)
	{	int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The sorted array is now " + arr[i]);
		}
	}


public static String[] bubblesearch(String str[],int n)
	{
		// Scanner sc =new Scanner(System.in);
		// System.out.println("Enter the total number of Strings");
		// int n = sc.nextInt();
		//String arr[]=new String[n];
		String temp;
		// for(int i=0;i<n;i++)
		// {
		// 	arr[i]=sc.next();
		// }
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;

				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(str[i]);
		return str;

	}

public static void tempc(char t1)
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

public static void cal(double p,double y,double rin)
	{
		double n=(12*y);
		double r=(rin/(12*100));
		double num,denom,denom1,total;
		num=(p*r);
		denom1=Math.pow(1+r,(-n));
		denom=1-denom1;
		total=(num/denom);
		System.out.println("The total value is " + total);


	}

}