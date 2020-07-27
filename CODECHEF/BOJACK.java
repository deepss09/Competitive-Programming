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
		    int d = sc.nextInt();
		    int n = 2*d+1;
		    System.out.println(n);
		    for(int i=0;i<n;i++){
		        if(i==d){
		          System.out.print("b");
		        }
		        else{
		            System.out.print("a");
		        }
		    }
		    System.out.println();
		}
	}
}
