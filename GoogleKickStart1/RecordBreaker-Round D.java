	import java.util.*;
import java.util.Scanner;

	public class Solution
	{
	    public static void main(String[] args) throws Exception{

	    	Scanner sc = new Scanner(System.in);
	    	int t = sc.nextInt();
	        int count = 0;

	        while(t-->0)
	        {
	            count++;
                int n = sc.nextInt();
	            int[] v = new int[n];
	            
	            for(int i = 0;i<n;i++)
	            {
	            	v[i] = sc.nextInt();
	            }
	            int k = 0;
	            int max = -1;
	            	for(int i=0;i<n-1;i++) {
	            		if(v[i]  > max) {
	            			max = v[i];
	            			if(i == n-1 || (v[i] > v[i+1])){
	            				k++;
	            			}
	            		}
	        System.out.println("Case #"+count+": "+k);
	    }
	}
	}
	}
	