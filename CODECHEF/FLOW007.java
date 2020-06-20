/* package codechef; // don't place package name! */
//import java.io.BufferedReader; 
//import java.io.InputStreamReader; 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
		    int n = Integer.parseInt(br.readLine());
		    int rev = 0;
		    while(n > 0){
		      int rem = n%10;
		      rev = (rev*10) + rem;
		       n = n/10;
		        }
		        System.out.println(rev);
		    }
		}
	}
