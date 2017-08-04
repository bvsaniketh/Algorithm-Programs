import java.util.*;
import java.lang.*;
import java.io.*;
class File1
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		String key1;
		System.out.println("Enter the number of Strings");
		int n=sc.nextInt();
		String str[]=new String[n];

		writefile(str,n);
		searchfile(n);
		
		//File fi =new File("f.txt");
	}

	static void writefile(String str[],int n)
	{
		try
		{
			PrintWriter fout =new PrintWriter("abc.txt");
			for(int i=0;i<n;i++)
		{
			Scanner sc=new Scanner(System.in);
			str[i]=sc.next();
		
			fout.print(str[i]+"\n");
		}
		fout.close();

		//searchfile(str,n);

		}catch(Exception e){System.out.println(e);}

	}

	static void searchfile(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to search");
		String key =sc.next();	
		String temp;
		String str[]=new String[n];
		int i=0;
		try
		{
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while((temp = br.readLine())!=null)
		{
			str[i]=temp;
			i++;
		}		
		br.close();
		fr.close();
	}catch(IOException e)
	{
		System.out.println(e);
	}

	str=Utility.bubblesearch(str,n);

	int flag1=Utility.bsearch(str,key);
	if(flag1==1)
		System.out.println("YES FOUND");
	else
		System.out.println("NOT FOUND");


	}													// int i;
}																		// while((i=br.read())!=-1)
																		// {
																		// 	for(int j=0;j<n;j++)
																		// 	str[j]=i;
																		// }

																		// for(i=0;i<n;i++)
																		// System.out.println(str[i]);
	
