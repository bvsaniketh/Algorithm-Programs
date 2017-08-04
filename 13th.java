import java.util.*;
import java.lang.*;
import java.io.*;

class Payment
{	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double rin=Double.parseDouble(args[2]);

		cal(p,y,rin);
		
	}
	static void cal(double p,double y,double rin)
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