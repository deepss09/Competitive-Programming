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
		    int count =0;
		    int d[] = new int[n];
		    for(int i=0;i<n;i++){
		        d[i] = sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        if(d[i]>=1000)
		        count++;
		    }
		
		System.out.println(count);
	}}
}
