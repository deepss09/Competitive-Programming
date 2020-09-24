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
		    int k = sc.nextInt();
		    int l = sc.nextInt();
		    if(k*l<n){
		        System.out.println(-1);
		    }
		    else if(k==1 && n>1){
		         System.out.println(-1);
		    }
		    else{
		        int temp = 0;
		        for(int i=0;i<n;i++){
		        if(temp == k) temp = 0;
		         System.out.print(++temp + " ");
		    }
		     System.out.println();
		}
	}
	}
}
