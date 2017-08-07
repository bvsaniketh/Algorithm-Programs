import java.util.*;
import java.lang.*;
import java.io.*;

class BinI
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=0,l=0,m=0,h=0;
		System.out.println("Enter the no. of the integers in the array");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		BinI bc= new BinI();
		bc.bini(arr,l,m,h,n);
	}

	void bini(int arr[],int l,int m,int h,int n)
	{
		Scanner sc = new Scanner(System.in);
		Arrays.sort(arr);
		int flag=0;
		l=0;
		h=n-1;
		m=(l+h)/2;
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
		System.out.println("Key found at " + m);
		else
		System.out.println("Key not found at all ");

		}

}