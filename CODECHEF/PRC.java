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
	   int T = sc.nextInt();
	   while(T-->0){
	   int N = sc.nextInt();
	   int K = sc.nextInt();
	   int[] P = new int[N];
	   int sum = 0;
	   for(int i = 0;i<N;i++){
	   if(sc.hasNextInt())
	    P[i]=sc.nextInt();
	    if(P[i] > K){
	       sum += P[i]-K;
	    }
	   }
	   System.out.println(sum);
	   }
	}
}