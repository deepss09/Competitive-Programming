/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int gcd(int a, int b){
        if(b == 0)
         return a;
         return gcd(b,a%b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int d = sc.nextInt();
		    int m = sc.nextInt();
		    if(d > m){
		        System.out.println(gcd(d,m));
		    }
		    else{
		        System.out.println(gcd(m,d));
		    }
		}
		
	}
}
