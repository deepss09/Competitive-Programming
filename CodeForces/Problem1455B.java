import java.util.Scanner;

public class Problem1455B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		  int x,k=0,sum=0;
		    x=sc.nextInt();
		    while(sum<x)
		    {
		        k++;
		        sum+=k;
		    }
		    if (sum==x+1)
		    System.out.println(k+1);
		    else
		    System.out.println(k);
		}
	}
	}

