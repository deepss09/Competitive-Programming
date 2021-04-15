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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int c = sc.nextInt();
		   int temp = x+(y/2);
		   
		   if(h*temp == c){
		       System.out.println("YES");
		   }
		   else if(h*temp< c){
		       System.out.println("YES");
		   }else{
		       System.out.println("NO");
		   }
		    }
		}
	}
