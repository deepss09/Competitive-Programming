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
		while(t-->0) {
			int n =sc.nextInt();
			int m = sc.nextInt();
		    int arr[] = new int[n];
		    
		    int count = 0;
		    HashSet<Integer> set = new HashSet();
		    for(int i=0;i<arr.length;i++) {
		    	arr[i] = sc.nextInt();
		    	if(arr[i] < m) set.add(arr[i]);
		    	if(arr[i] == m) count++;
		    }
		    int small = (m - 1);
		    if(set.size() < small) System.out.println(-1);
		    else {
		    	System.out.println(n - count);
		}

	}

	}
}
