/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            a[i]=in.nextLong();
            List<Long> or=new ArrayList<>();
            boolean f=false;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    long temp=0L;
                    for(int k=i;k<=j;k++)
                    temp=temp|a[k];
                    if(or.contains(temp)==true)
                    {
                        f=true;
                        break;
                    }
                    or.add(temp);
                    
                }
                if(f==true)
                break;
            }
            if(f==true)
            System.out.println("NO");
            else
            System.out.println("YES");
            
        }
    }
}
