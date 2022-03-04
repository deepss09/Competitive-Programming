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
		    int xa = sc.nextInt();
		    int xb = sc.nextInt();
		    int xc = sc.nextInt();
		    int a = 0, b = 0, c =0 ;
		    if(xa > 50){
		        a++;
		    }
		    if(xb > 50){
		        b++;
		    }
		    if(xc>50){
		       c++;
		    }
		    if(a == 1) System.out.println("A");
		    if(b == 1)  System.out.println("B");
		    if(c == 1)  System.out.println("C");
		    if(a == 0 && b == 0 && c == 0)  System.out.println("NOTA");
		    }
		}
	}
