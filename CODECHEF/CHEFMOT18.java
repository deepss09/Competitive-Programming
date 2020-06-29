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
		while(t-->0)
		{
		   StringBuilder sb = new StringBuilder();
		   long s = sc.nextLong();
		   long n = sc.nextLong();
		   long count = 0;
		   
		   count += s/n;
		   s = s%n;
		   n = n-2;
		    if(s%2==1){
	            count++;
	            s--;
	        }
	        if(s>0) count++;
	    
	        sb.append(count);
	        System.out.println(sb);
}
}
}