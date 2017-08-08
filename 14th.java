import java.util.*;
import java.io.*;
import java.lang.*;

class Sqrt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        double p=sqrtnum(a);
        System.out.println(p);

    }

   static double sqrtnum(int a)
    {
        double epsilon = Math.exp(-15);
        double t = (double)a;
        while(Math.abs(t - (a/t)) > (epsilon * t))
        {
            t = (a/(2 * t)) + (t/2);
        }
        return t;
    }
}