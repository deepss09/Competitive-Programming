/* package codechef; // don't place package name! */
// 	 import java.io.BufferedReader; 
// 	 import java.io.IOException; 
// 	 import java.io.InputStreamReader; 
// 	 import java.util.StringTokenizer;
	import java.util.*;
	import java.lang.*;
	import java.io.*;

	/* Name of the class has to be "Main" only if the class is public. */
	public class Main
	{
	    public static void main (String[] args) throws java.lang.Exception
		{
	   Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    long n= sc.nextLong();
		    long arr[];
		    arr = new long[100000];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextLong();
		    }
		    long sum = 0;
		    for(int i=0;i<n-1;i++){
		        if(arr[i] <= arr[i+1]){
		            sum += ((arr[i+1]-arr[i]) - 1);
		        }
		        else if(arr[i] >= arr[i+1]){
		            sum += ((arr[i] - arr[i+1]) - 1);
		        }
		        else
		            sum += 0;
		        }
		        System.out.println(sum);
		    }
		}
	}
