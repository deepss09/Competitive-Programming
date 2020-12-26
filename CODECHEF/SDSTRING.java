/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int numberOfZeros(String s) {
        
        int c = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0') {
                c++;
            }
        }
        
        return c;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    int zero = numberOfZeros(s);
		    int one = s.length() - zero;
		     if(s.length()%2 !=0 || zero == 0 || one ==0)
		        {
		            System.out.println(-1);
		        }
		      else {
		      
		          int ans = Math.abs(zero- one)/2;
		          System.out.println(ans);
		          
		      }  
		        
		}
	}
}
