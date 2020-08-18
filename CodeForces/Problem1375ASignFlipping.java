import java.util.Scanner;

public class Problem1375ASignFlipping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long a[] = new long[n+1];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextLong();
				a[i] = Math.abs(a[i]);
			}
			for(int i=0;i<n;i+=2) {
			 a[i]=-a[i];
	      }
	      for(int i=0;i<n;i++)
	      {
	        System.out.print(a[i]+" ");
	      }
	      System.out.println();
	    } 
	  }
	}
	    
