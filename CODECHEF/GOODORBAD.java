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

            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int up=0,lo=0;
            for (int i=0;i<n;i++){
                if(isUpperCase(s.charAt(i))){
                    up++;
                }else if(isLoweCase(s.charAt(i))){
                    lo++;
                }
            }
            if((up+k)>=n && (lo+k)>=n){
                System.out.println("both");
            }else if((up+k)<n && (lo+k)<n)
                System.out.println("none");
            else if((up+k)>=n)
                System.out.println("brother");
            else if((lo+k)>=n)
                System.out.println("chef");
        }
    }
     private static boolean isUpperCase(char charAt) {
        if(65<=charAt && charAt<=90)
            return true;
        else
            return false;
    }
    private static boolean isLoweCase(char charAt) {
        if(97<=charAt && charAt<=122)
            return true;
        else
            return false;
    }
	
}
