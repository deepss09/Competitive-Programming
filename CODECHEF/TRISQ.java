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
	         int n = sc.nextInt();
	         System.out.println(square(n));
	     }
	}
	static int square(int b){
	    if(b == 0 || b == 1 || b == 3){
	        return 0;
	    }
	     return (b/2-1)+square(b-2);
	
	}
}
