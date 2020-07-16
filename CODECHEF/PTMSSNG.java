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
	       int x = 0, y = 0;
	       int a,b;
	       int n = sc.nextInt();
	       for(int i=0;i<(4*n) - 1;i++){
	           a = sc.nextInt();
	           b = sc.nextInt();
	       x^=a;
	       y^=b;
	   }
	    System.out.println(x+" "+y);
        }
	}
}