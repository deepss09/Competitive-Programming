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
          int x = sc.nextInt();
          int a[] = new int[n];
          for(int i=0; i<n; i++) {
              a[i] = sc.nextInt();
          }
          Arrays.sort(a);
          int ans = 0,i=0;
            for( i=0; i<n; i++){
              if(a[i]<x){
                  int y = x;
                  ans++;
                  y = a[i];
                  y *= 2;
                  if(y > x) {x = y;}
              }
              else{
                  break;
              }
            }
            while(i!=n) {
                ans++;
                if(x>=a[i]) {
                  x=a[i];
                  i++;
                  x*=2;
                }
                else
                  x*=2;
            }
        System.out.println(ans);
       }
    }
}