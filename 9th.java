import java.util.*;
import java.io.*;
import java.lang.*;

class MergeSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements size and values");
		int n=sc.nextInt();
		String arr[]=new String[n];
		
		for(int i=0;i<n;i++)
			{
			arr[i]=sc.next();
			}

		System.out.println("Elements are :" );
		printarr(arr);
		MergeSort ob=new MergeSort();
		ob.merge(arr,0,arr.length-1);
		System.out.println("Sorted elements are :" );
		printarr(arr);

	}
	static void printarr(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static void merge(String arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			merge(arr,l,m);
			merge(arr,m+1,r);

			mergeso(arr,l,m,r);

		}
	}

	static void mergeso(String arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;

		String a[]=new String[n1];
		String b[]=new String[n2];

		for(int i=0;i<n1;i++)
			a[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			b[j]=arr[m+1+j];
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(a[i].compareTo(b[j])<0)
			{
				arr[k]=a[i];
				i++;
			}
			else
			{
				arr[k]=b[j];
				j++;

			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=a[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=b[j];
			j++;
			k++;
		}


	}


}
