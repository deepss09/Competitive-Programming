import java.util.Arrays;
import java.util.Scanner;

public class Problem450A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		 double count = 0;
		 int ans = 0;
		int[] a = new int[n+1];
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextInt();
       if(count <= Math.ceil((double)a[i]/m)) {
    	   count = Math.ceil((double)a[i]/m);
    	   ans = i;
       }
        }
        	System.out.println(ans+1);
	}
}
