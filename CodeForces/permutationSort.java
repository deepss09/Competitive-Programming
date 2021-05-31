import java.util.Arrays;
import java.util.Scanner;

public class permutationSort {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	 
	        while(t-- > 0){
	            int n=sc.nextInt();
	 
	            int[] arr=new int[n];
	            for(int i=0;i<n;i++)
	            arr[i]=sc.nextInt();
	 
	            int result = solve(n,arr);
	 
	            System.out.println(result);
	        }
	 
	        sc.close();
	    }
	    public static int solve(int n,int[] arr){
	 
	        boolean sorted=true;
	        for(int i=0;i<n;i++) {
	            if(arr[i]!=(i+1)){
	                sorted=false;
	            }
	        }
	        if(sorted)return 0;
	 
	        if(arr[0]==1 || arr[n-1]==n)return 1;
	        if(arr[0]==n && arr[n-1]==1)return 3;
	        
	        return 2;
	    }
	 
	}
