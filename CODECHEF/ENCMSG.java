/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
		    int n=Integer.parseInt(br.readLine());
		    String s=br.readLine();
		    char a[]=s.toCharArray();
		    for(int i=0;i<n;i+=2)
		    {
		        if(i+1<n)
		        {
		            char temp=a[i];
		            a[i]=a[i+1];
		            a[i+1]=temp;
		        }
		    }
		    for(int j=0;j<n;j++)
		    {
		        int c=(int)a[j];
		        c=122-c+97;
		        //System.out.print(c);
		        char d=(char)c;
		        System.out.print(d);
		        //a[j]=d;
		    }
		   /* for(int k=0;k<n;k++)
		    {
		        System.out.print(a[k]);
		    }*/
		    System.out.print("\n");
		}
	}
}