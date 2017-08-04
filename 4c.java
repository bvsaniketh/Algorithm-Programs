import java.util.*;
import java.lang.*;
import java.io.*;

class InsertI
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		InsertI(arr,n);
	}

	static void InsertI(int arr[],int n)
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

}