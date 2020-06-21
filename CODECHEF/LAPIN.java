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
		while(t>0)
		{
		    String s=sc.next();
		    String s1="";
		    String s2="";
		    int len=s.length();
		    if(len%2==0)
		    {
		        s1=s1+s.substring(0,len/2);
		        s2=s2+s.substring(len/2,len);
		    }
		    else{
		        s1=s1+s.substring(0,len/2);
		        s2=s2+s.substring(len/2+1,len);
		    }
		    char c1[]=s1.toCharArray();
		    char c2[]=s2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    if(Arrays.equals(c1,c2))
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		    
		}
		
	}
}