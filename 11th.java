import java.util.*;
import java.lang.*;
import java.io.*;
class Calendar
{
	public static void main(String args[])
	{
		int day,month,year;
		Scanner sc=new Scanner(System.in);
		day=Integer.parseInt(args[0]);
		month=Integer.parseInt(args[1]);
		year=Integer.parseInt(args[2]);

		Calendar1(day,month,year);

	}

	static void Calendar1(int day,int month,int year)
	{
		int y1,x,m1,day1;
		y1=(year-(14-month))/12;
		x=y1+(y1/4)-(y1/100)+(y1/400);
		m1=((month+12)*((14-month)/12))-2;
		day1=(((day+x+(31*m1)/12))%7);
		System.out.println(day1);

	}
}