import java.util.*;
import java.lang.*;
import java.io.*;

class Money
{	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);

		int amt=sc.nextInt();
		Money m=new Money();
		m.ntsamt(amt);

	}

	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,a,b,c;
	void ntsamt(int amt)
	{	int tot;
		if(amt>=1000)
		{	
			
			n1=(amt/1000);
			a=(amt%1000);
			System.out.println("Thousands + " + n1);
			ntsamt(a);


		}
		else if(amt>=500)
		{	
			n2=(amt/500);
			a=(amt%500);
			System.out.println("Five Hundreds + " +n2);
			ntsamt(a);
		}
		else if(amt>=100)
		{	
			n3=(amt/100);
			a=(amt%100);
			System.out.println("Hundreds + " +n3);
			ntsamt(a);
		}
		else if(amt>=50)
		{	
			n4=(amt/50);
			a=(amt%50);
			System.out.println("Fifty + " +n4);
			ntsamt(a);
		}
		else if(amt>=10)
		{	
			n5=(amt/10);
			a=(amt%10);
			System.out.println("Tens + " +n5);
			ntsamt(a);
		}
		else if(amt>=5)
		{	
			n6=(amt/5);
			a=(amt%5);
			System.out.println("Fives + " +n6);
			ntsamt(a);
		}
		else if(amt>=2)
		{	
			n7=amt/2;
			a=(amt%2);
			System.out.println("Two's + " +n7);
			ntsamt(a);
			
		}
		else if(amt>=1)
		{	
			n8=amt/1;
			System.out.println("One's + " +n8);
			
		}
		if(amt==0)
	{ tot=n1+n2+n3+n4+n5+n6+n7+n8;
		 System.out.println(tot);
	 }
	}

	// tot=n1+n2+n3+n4+n5+n6+n7;
	//  System.out.println(tot);
	
}