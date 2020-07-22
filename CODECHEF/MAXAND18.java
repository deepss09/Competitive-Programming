/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		    long[] sarr=new long[32];
		    int or=0;
		    for(int i=0;i<n;i++){
		        or=or|arr[i];
		        for(int j=0;j<32;j++){
		            int a=1<<j;
		            if((arr[i]&a)!=0) sarr[j]+=a;
		        }
		    }
		     int ans=0;
		     int cnt=Integer.bitCount(or);
		      int[] arr1=new int[32];
		    for(int i=0;i<32;i++) arr1[i]=i;
		    for(int i=0;i<32;i++){
		        for(int j=i+1;j<32;j++){
		            if(sarr[j]>sarr[i]){
		                int temp=arr1[j];
		                arr1[j]=arr1[i];
		                arr1[i]=temp;
		                long temp1=sarr[j];
		                sarr[j]=sarr[i];
		                sarr[i]=temp1;
		            }
		            else if(sarr[j]==sarr[i]){
		                if(arr1[j]<arr1[i]){
		                    int temp=arr1[j];
		                arr1[j]=arr1[i];
		                arr1[i]=temp; 
		                }
		            }
		        }
		    }
		    for(int i=0;i<k;i++) ans=ans|1<<arr1[i];
		    System.out.println(ans);
		}
	}
}
