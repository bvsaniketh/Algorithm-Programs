import java.util.*;
import java.io.*;
import java.lang.*;

class ToBinary
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		binarycon(n);
	}

	static String binarycon(int n){
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
		int val=Integer.parseInt(s);
		while(val>0)
		{
			int temp=val%10000;
			System.out.println("Splitting in 4's of bits" + temp);
			val=val/10000;
			//System.out.println("Splitting in 4's of bits" + val);
		}
		return s;

	}
}	

