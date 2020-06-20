/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner =new Scanner(System.in);
    int T=scanner.nextInt();
    for(int z=0;z<T;z++){
       int N=scanner.nextInt();
       int min=scanner.nextInt();
       int temp=scanner.nextInt();
       int L=scanner.nextInt();
       int R=scanner.nextInt();
       int ans=-1;
       
       for(int i=0;i<N;i++){
           int t=scanner.nextInt();
           int p=scanner.nextInt();
           int x;
           if(t>temp){
               
               x=(t-min<=temp)?temp:t-min;
               
           }else if(t<temp){
               x=(t+min>=temp)?temp:t+min;
           }else{
               x=temp;
           }
           
           if(x<=R&&x>=L){
               if(ans==-1){
                   ans=p;
               }else{
                  ans=(ans<p)?ans:p;
               }
           }
       }
       
       System.out.println(ans);
       
    }
    }
}