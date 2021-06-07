
	import java.util.Arrays;
import java.util.Scanner;

public class Problem1486A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int h[] = new int[n+1];
			for(int i=0;i<n;i++) 
				h[i] = sc.nextInt();
			long sum =0;
			long tm = 0;
			boolean flag = true;
			for(int i=0;i<n;i++) {
				tm+=i;
				sum+=h[i];
				if(sum < tm) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
			