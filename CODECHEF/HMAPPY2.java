/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static long gcd(long c,long d){
       	if(c<d)
			return gcd(d,c);
		if(d == 0)
			return c;
		return gcd(d,c%d);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long n = sc.nextLong();
		    long a = sc.nextLong();
		    long b = sc.nextLong();
		    long k = sc.nextLong();
		    long na  = n/a;
		    long nb = n/b;
		    long total = n/((a*b)/gcd(a,b));
		    long ans = na + nb - 2*total;
		    if(ans >= k){
		        System.out.println("Win");
		    }
		    else{
		        System.out.println("Lose");
		    }
		}
	
		    }
}
