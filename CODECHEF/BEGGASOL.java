/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   try {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t--!=0)
	        {
	            int n=sc.nextInt();
	            int[] f=new int[n];
	            for(int i=0;i<n;i++)
	            {
	                f[i]=sc.nextInt();
	            }
	            int gas=f[0];
	            int dist=0;
	            for(int i=1;i<n;i++)
	            {
	                if(gas==0)
	                {
	                    break;
	                }
	                gas=gas+f[i]-1;
	                dist++;
	            }
	            System.out.println(gas+dist);
	        }
	    } catch(Exception e) {
	    }
	}
}
