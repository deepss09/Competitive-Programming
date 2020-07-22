/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
    
        while(t-->0)
        {
            long n=Long.parseLong(br.readLine());
            boolean flag=false;
            long ans=Long.MAX_VALUE;
            for(long i=1;i*i<=n;i++)
           {
             if(n%i==0)
             {
                 long x=(n/i-i)/2;
                 long y=(n/i+i)/2;
                 if(x!=0 &&y*y==(n+x*x))
                 {
                     flag=true;
                     ans=Math.min(ans, x);
                 }
             }
           }
           if(flag)
           {
               System.out.println(ans*ans);
           }
           else
            {
                System.out.println(-1);
            }
        }
	}
}
