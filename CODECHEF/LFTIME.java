import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
	    while(T-->0){
	        int n = s.nextInt();
	        int q = s.nextInt();
	        long curr = 0;
	        long total = 0;
	       for(int i=0;i<q;i++){
	           int f = s.nextInt();
	           int d = s.nextInt();
	          total+= (long) Math.abs(curr - f);
	          total+= (long) Math.abs(d-f);
	          curr = d;
	           }
	           System.out.println(total);
	       } 
	    }
		
	}
