import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryS
{
  public static void main(String args[])
  {
    
  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Strings");
    int n=sc.nextInt();
    
    String arr[]=new String[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.next();
    }

    System.out.println("Enter the key to search");
    String key1=sc.next();
    int l=0,mid,h=n;
    int flag=0;

     flag=BinaryS.bsearch(arr,l,h,key1);
    System.out.println("String at :" +flag);
    if(flag==-1)
    System.out.println("Not found");  //convert to character array of the string


  }
   static int bsearch(String []str,int l, int h, String key1)
  {
    //System.out.println(l+""+r);
    if(l <= h)
    {
      int mid = l + (h-1)/2;

      if( str[mid].equalsIgnoreCase(key1) )
      {
        return mid;
      }
      else if( str[mid].compareTo(key1) > 0)
      {
        return bsearch(str,l,mid-1,key1);
      }
      else //if( arr[mid] < value)
      {
        return bsearch(str,mid+1,h,key1);
      }
    }
    return -1;

  }
}