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
		    int h = sc.nextInt();
		    int p = sc.nextInt();
		    boolean flag  = false;
		    while(p > 0) {
		    	h = h - p;
		    	p = p/2;
		    	if(h<=0) {
		    		flag = true;
		    		break;
		    	}
		    }
		    if(h <= 0 || flag) 
		    	System.out.println(1);
		    	else
		    		System.out.println(0);
		    }
		   
	}
}