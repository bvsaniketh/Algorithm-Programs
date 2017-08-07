import java.util.*;
import java.lang.*;
import java.io.*;
class File1
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		String key1;
		String str=sc.next();
		File1 poo =new File1();
		poo.writefile(str);
		poo.searchfile();
		
		//File fi =new File("f.txt");
	}

	 void writefile(String str)
	{
		try{
																						// try
		File f1 =new File("f1.txt");
		PrintWriter pw =new PrintWriter(f1);
		pw.print(str);		
		pw.close();																		// {
																						// 	PrintWriter fout =new PrintWriter("abc.txt");
		}catch(FileNotFoundException e)
		
		{
			System.out.println(e);
		}																				// 	for(int i=0;i<n;i++)
																						// {
	}	

	void searchfile()
	{
		String key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to search");
		key=sc.next();
		ArrayList<String> a1 =new ArrayList<String>();
		try{

		
		File file =new File("f1.txt");
		Scanner sc1 = new Scanner(file).useDelimiter(",");
		


		while(sc1.hasNext())
		{
			a1.add(sc1.next());
		}
		}

		catch(IOException e)
		{
			System.out.println(e);
		}

		String str1[]=a1.toArray(new String[a1.size()]);
		str1=Utility.bubblesearch(str1,str1.length);

		int flag11=Utility.bsearch(str1,0,str1.length,key);
		
		if(flag11==1)
			System.out.println(key + "Found");
		else
			System.out.println(key + "Not Found");



	}
	}																		
	// 	Scanner sc=new Scanner(System.in);
	// 	str[i]=sc.next();
																						
    // 	fout.print(str[i]+"\n");
	// }
	// fout.close();

	// //searchfile(str,n);

	// }catch(Exception e){System.out.println(e);}
	

// 	static void searchfile(int n)
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the word to search");
// 		String key =sc.next();	
// 		String temp;
// 		String str[]=new String[n];
// 		int i=0;
// 		try
// 		{
// 		FileReader fr=new FileReader("abc.txt");
// 		BufferedReader br = new BufferedReader(fr);
		
// 		while((temp = br.readLine())!=null)
// 		{
// 			str[i]=temp;
// 			i++;
// 		}		
// 		br.close();
// 		fr.close();
// 	}catch(IOException e)
// 	{
// 		System.out.println(e);
// 	}

// 	str=Utility.bubblesearch(str,n);

// 	int flag1=Utility.bsearch(str,0,n,key);
// 	if(flag1==1)
// 		System.out.println("YES FOUND");
// 	else
// 		System.out.println("NOT FOUND");


// 	}													