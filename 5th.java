import java.util.*;
import java.lang.*;
import java.io.*;

class Guess
{	
	public static void main(String args[])
	{
		
		int n=Integer.parseInt(args[0]);
		System.out.println(n);
		int l=0,h;
		h=(int)Math.pow(2,n)-1;
		System.out.println(h);
		int p=guessnum(l,h);
		System.out.println(p + " " + "is the number");

	}


	static int guessnum(int l,int h)
	{
		Scanner sc=new Scanner(System.in);
		if((h-l)==1)
			return l;
		int m=(l+h)/2;
		System.out.println("Is it less than" + " " + m );
		String opt=sc.next();
		if(opt.equalsIgnoreCase("yes"))
		{
			return guessnum(l,m);
		}
		else
		{
			return guessnum(m+1,h);
		}
	}
}

// 	static void guessnum(int n)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println(n);
// 		int l=0,h;
// 		int p=0;
// 		h=(int)Math.pow(2,n)-1;
// 		System.out.println(h);
// 		System.out.println(" Is the number between l and h"+ " " + l + " " + h);
// 		//char opt=sc.next().charAt(0);
// 		// while(n<5)
// 		// {
// 		String opt=sc.next();
// 		if(opt.equalsIgnoreCase("yes"))
// 		// range(l,h,opt);
// 		// }
// 		{
// 		int q=n-1;	
// 		range(l,h,opt,q,p);
// 		}
// 		else
// 		System.out.println("Not Available");
// 	}
// 	static void range(int l,int h,String opt,int q,int p)
// 	{	

// 		Scanner sc=new Scanner(System.in);
// 		int m;
// 		if(p<q)
// 		{ 

		 
// 		//if(l!=0)
// 		//{
// 		//System.out.println("Now :");
// 		//opt=sc.next();
// 		if(opt.equalsIgnoreCase("yes"))
// 		{

// 		m=(l+h)/2;
// 		System.out.println(" Is the number between l and h1"+ " " + l + " " + m);
// 		opt=sc.next();
// 		if(opt.equalsIgnoreCase("yes"))
// 		range(l,m,opt,q--,p);
// 		}

// 		if(opt.equalsIgnoreCase("no"))
// 		range(m+1,h,opt,q--,p);
		
// 		System.out.println(m +" is the number");
// 		}

// 		// if(opt.equalsIgnoreCase("no"))

// 		// {	m=(l+h)/2;
// 		// 	System.out.println(" Is the number between l and h1"+ " " + (m+1) + " " + h);
// 		// 	opt=sc.next();
// 		// 	range(m+1,h,opt,q--,p);
// 		// 	System.out.println(m +" is the number");
// 		// }
// 		// System.out.println(m +" is the number");
// 		//}
// 	}
// 		//System.out.println(m +" is the number");
// 		// {	
// 		// System.out.println(opt);
		
// 		// range(l,m)

// 		// }
// 	}
// }