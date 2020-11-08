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
		    long a[] = new long[n+1];
		    int odd = 0;
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextLong();
		        if(a[i]%2 != 0){
		            odd++;
		        }
		    }
		    int ans = 1;
	        if(odd % 2 != 0 && n > 1){
	            ans++;
	        }
	       
	        System.out.println(ans);
	        
		        
		    }
		}
	}
