/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	int n=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long[] arr=new long[n];
		int k=0;
		while(sc.hasNext()){
		    arr[k]=sc.nextInt();
		    k=k+1;
		}
		Arrays.sort(arr);
		long max=0;
		for(int i=0;i<n;i++){
		    long a=arr[i]*(n-i);
		    if(a>max){
		        max=a;
		    }
		}
		System.out.println(max);
	}
}
