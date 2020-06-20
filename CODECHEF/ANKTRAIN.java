/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    if(n%8==1)
		    System.out.println(n+3+"LB");
		    if(n%8==2)
		    System.out.println(n+3+"MB");
		    if(n%8==3)
		    System.out.println(n+3+"UB");
		    if(n%8==4)
		    System.out.println(n-3+"LB");
		    if(n%8==5)
		    System.out.println(n-3+"MB");
		    if(n%8==6)
		    System.out.println(n-3+"UB");
		    if(n%8==7)
		    System.out.println(n+1+"SU");
		    if(n%8==0)
		    System.out.println(n-1+"SL");
		}
	}
}

