import java.util.*;
import java.lang.*;
import java.io.*;

class PrimeAna
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,flag=0,count=0,k=0,temp1,sum=0,rev;
		int arr[]=new int[1000];
		int brr[]=new int[1000];
		int i,j;
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a;i<b;i++)
		{

			flag=0;

		for(j=2;j<i;j++)

			{ 
				if(i%j==0)
			
				{
					flag =1;
					break;
				}
			}
				
				if(flag==0)
				{	
					
					if(i==0 || i==1)
					{

					}
					
					else

					{	

						System.out.println("Primes are"+ i);
						count++;
						arr[k]=i;
						k++;
						boolean st = checkp(i);
						if(st)
							System.out.println("Pallindrome"+ i);
						else
							System.out.println(" Not Pallindrome"+ i);
						
					}
					
				}
			}
			for(i=0;i<count;i++)
			{	String str=String.valueOf(arr[i]);
				char c[]=str.toCharArray();
				Arrays.sort(c);
				String str1=String.valueOf(c);
				int st =Integer.parseInt(str1);
				brr[i]=st;
				
				{
					//System.out.println(arr[i]+ " " + brr[i]);
				}//System.out.println(brr[i]);
			}
			for(int m=0;m<count;m++)
			{
				for(int p=m+1;p<count;p++)
				{
					if(brr[m]==brr[p])
					{	int length,length1;
						// length=(int)(Math.log10(brr[m])+1);
						// length1=(int)(Math.log10(brr[p])+1);
						//if(length==length1)
						System.out.println(arr[m]+ " " + arr[p]);
					}

				}
			}
		}
		
		static boolean checkp(int i)
		{	int sum=0,rev;
			int temp1=i;
						
						if(i>9)

						{	while(i!=0)
							
							{

							rev=i%10;
							sum=(sum*10)+rev;
							i=i/10;

							}

						
					}
					if(temp1==sum)
							return true;
						else 
							return false;
						
		}
}
	

