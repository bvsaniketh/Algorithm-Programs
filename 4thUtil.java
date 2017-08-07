import java.util.*;
import java.lang.*;
import java.io.*;

class Util1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		int choice;
	
		ArrayList<Double>timings=new ArrayList<Double>();
		HashMap<String,Double> hm=new HashMap<String,Double>();

		double start=0,stop=0,total;
		int select1;
		//Scanner sc =new Scanner(System.in);
		System.out.println("Enter the total number of elements you want to enter");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		String str1[]=new String[n];
		
		System.out.println("Enter the integer array of max of elements " + " " + n);
		for(int i=0;i<n;i++)
		arr1[i]=sc.nextInt();

		System.out.println("Enter the string array of max of elements " + " " + n);
		for(int j=0;j<n;j++)
		str1[j]=sc.next();

	do {

		System.out.println( "1) Binary Search (Integer)\n2) Binary Search (String)\n3) Insertion Sort (Integer)\n4) Insertion Sort (String)\n5) Bubble Sort (Integer)\n6) Binary Search (Integer)");
		 choice=sc.nextInt(); //
		System.out.println(choice);
		
		switch(choice)
		{	
			//int l=0;
			case 1:
			start=(System.nanoTime());
			int flag11=Utility.bini(arr1,n);
			if(flag11==1)
			{
				stop=(System.nanoTime());
			}
			total=(stop-start)/10000;
			System.out.println(total);
			timings.add(total);
			hm.put("Binary Search (I)",total);
			break;

			case 2:
			start=(System.nanoTime());
			String key1;
    		System.out.println("Enter the key to search for");
    		key1=sc.next();
    		String str2[]=new String[n];
    		str2=Utility.bubblesearch(str1,n);
			int flag12=Utility.bsearch(str2,0,n,key1);
			if(flag12==1)
			{
				stop=(System.nanoTime());
			}
			total=(stop-start)/10000;
			System.out.println(total);
			timings.add(total);
			hm.put("Binary Search (S)",total);
			break;

			case 3:
			start=(System.nanoTime());
			Utility.InsertI(arr1,n);
			stop=System.nanoTime();
			total=(stop-start);
			System.out.println(total);
			timings.add(total);
			hm.put("Insertion Sort (I)",total);
			break;

			case 4:
			start=(System.nanoTime());
			//String key1;
    		// System.out.println("Enter the key to search for");
    		// key1=sc.next();
			Utility.insertstring(str1,n);
			stop=(System.nanoTime());
			total=(stop-start);
			System.out.println(total);
			timings.add(total);
			hm.put("Insertion Sort (S)",total);
			break;

			case 5:
			start=(System.nanoTime());
			Utility.bubbleI(arr1,n);
			stop=System.nanoTime();
			total=(stop-start);
			System.out.println(total);
			timings.add(total);
			hm.put("Bubble Sort (I)",total);
			break;

			case 6:
			start=(System.nanoTime());
			//String key1;
    		// System.out.println("Enter the key to search for");
    		// key1=sc.next();
			Utility.bubblesearch(str1,n);
			stop=(System.nanoTime());
			total=(stop-start);
			System.out.println(total);
			timings.add(total);
			hm.put("Bubble Sort (S)",total);
			break;


			default:
			System.out.println("Invalid output press 7 to exit");
			
			
		}
		//choice=sc.nextInt();
	}while(choice!=7);

	// for(double obj:timings)
	// // 	System.out.println(obj); //can print even by iterator 
	// Iterator itr=timings.iterator();
	// while(itr.hasNext())
	// {
	// 	System.out.println(itr.next());
	// }

	

	for(Map.Entry m:hm.entrySet())
	{
		System.out.println("Key"+ m.getKey() + " " + " Value"+ " "+ m.getValue());
	}	

	Double arr2[]=new Double[timings.size()];
	for(int i1=0;i1<arr2.length;i1++)
	{
		arr2[i1]=timings.get(i1);
	}
	Arrays.sort(arr2);
	for(int k=0;k<arr2.length;k++)
	{
		System.out.println("After Sorting the values are:  " + arr2[k]);
	}
	
}
}