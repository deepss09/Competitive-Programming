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
		    int w[] = new int[n+1];
		    int flag = 0;
		    for(int i=0;i<n;i++){
		        w[i] = sc.nextInt();
		        if(k < w[i]){
		            flag = 1;
		        }
		    }
		    int count = 0, sum = 0, visit = 0;
		    if(flag==0) {
            for(int i=0;i<n;i++){
                sum+=w[i];
               if(sum>k){
                count++;
                i=i-1;
                sum=0;
                visit=1;
               }
            }
            if(visit==0){
                System.out.println("1");
            }
            else
                System.out.println(count+1) ;
        }

        else
            System.out.println("-1");
		}
	}
}
