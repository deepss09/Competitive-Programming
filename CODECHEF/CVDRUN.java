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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int j = 0;
		    if(y>n){
		        System.out.println("NO");
		    }else{
		         for(int i=1;i<=n;i++){
		      x = (x+k)%n;
	           if(x==y)
	            {
    	            System.out.println("YES");
    	            j++;
    	            break;
	            }
	        }
	   }
	       if(j==0)
             System.out.println("NO");
	    }
		}
	}
