/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
	   FastReader sc=new FastReader(); 
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<n;i++){
	            if(a[i]%k==0){
	               sb.append(1);
	            }
	            else{
	               sb.append(0);
	            }
	        }
	            System.out.println(sb);
	     }
	    
		// your code goes here
	}
}
