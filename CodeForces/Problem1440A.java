import java.util.Scanner;

public class Problem1440A {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	        int T=in.nextInt();
	        while(T-->0)
	        {
	            int n=in.nextInt();
	            int cost_zero=in.nextInt();
	            int cost_one=in.nextInt();
	            int h=in.nextInt();
	            char arr[]=in.next().toCharArray();
	            long ans=0;
	            for(int i=0;i<arr.length;i++)
	            {
	                if(arr[i]=='0')
	                {
	                    ans=ans+(Math.min(h+cost_one,cost_zero));
	                }
	                else{
	                    ans=ans+(Math.min(h+cost_zero,cost_one));
	                }
	            }
	            System.out.println(ans);
	        }
	    }
	}