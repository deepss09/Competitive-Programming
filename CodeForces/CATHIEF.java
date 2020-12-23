/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    long k=sc.nextLong();
		    long n=sc.nextLong();
		    if(Math.abs(x-y)%(2*k)==0){
		        System.out.println("Yes");
		    }
		        else{
		            System.out.println("No");
		        }
		    }
		}
	}
