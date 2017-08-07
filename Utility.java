import java.util.*;
import java.lang.*;
import java.io.*;

public final class Utility
{
	private Utility()
	{

	}	



public static int bini(int arr[],int n)   
	{
		Scanner sc = new Scanner(System.in);
		Arrays.sort(arr);
		int flag=0;

		int l=0;
		int h=n-1;
		int m=(l+h)/2;
		System.out.println("Enter the value of the key to search for");
		int key =sc.nextInt();
		
		
			
		while(l<=h)
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
		{
			System.out.println("Key found at " + m);
			return 1;
		}
		else
		{	System.out.println("Key not found at all ");
			return -1;
		}

		}


 public static int bsearch(String []str,int l,int n,String key1)
  {
    //System.out.println(l+""+r);
    //Scanner sc = new Scanner(System.in);
  
    
    int h=n-1;

    if(l <= h)
    {
      int mid = (l + h)/2;

      if( str[mid].equalsIgnoreCase(key1) )
      {
      	System.out.println("Found at position " +mid);
        return 1;
      }
      else if( str[mid].compareTo(key1) > 0)

      {
        return bsearch(str,l,mid-1,key1);
      }
      else if( str[mid].compareTo(key1) < 0)
      {
        return bsearch(str,mid+1,h,key1);
      }
    }
    System.out.println("Not found");
    return -1;

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

public static void insertstring(String str[],int n)
	{
		// Scanner sc=new Scanner(System.in);
		// System.out.println("ENter the total number of Strings");
		// int n = sc.nextInt();
		// String arr[]=new String[n];
		String key;
		int i,j;
		// for(i=0;i<n;i++)
		// {
		// 	str[i]=sc.next();
		// }
		for( i=1;i<n;i++)
		{
			key=str[i];
			j=i-1;
			while(j>=0 && str[j].compareTo(key)>0)
			{
				str[j+1]=str[j];
				j--;
			}
			str[j+1]=key;
		}
		for( i=0;i<n;i++)
		{
			System.out.println("The sorted strings are : " + str[i]);
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
		System.out.println("The sorted strings are now" + " " +str[i]);
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

public static String binarycon(int n)
{
		int num,sum=0,rem=0;
		int k=0;
		int i=0,count=0;
		int add,nz;
		String s,finals;
		while(n>0)
		{	
			rem=n%2;
			sum=sum+(int)(rem*Math.pow(10,k++));
			n=n/2;
		}
		System.out.println(sum);
		System.out.println(k);

		
		while(k>=Math.pow(2,i))
		{
			i++;	
			count++;
		}
		//System.out.println(count);
		add=(int)Math.pow(2,count);
		//System.out.println(add);
		nz=add-k;
		System.out.println(nz +" " + "These many zeroes are to be added");
		s=String.valueOf(sum);

		for(int j=0;j<nz;j++)
		s=0+s;
		System.out.println(s);
		return s;

	}

}