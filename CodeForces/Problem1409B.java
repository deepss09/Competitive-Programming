import java.util.Scanner;

public class Problem1409B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		
		long abs1 = Math.min(n, a-x);
		long ans1 = (a - abs1) * (b - Math.min(b - y, n - abs1));
		
		long abs2 = Math.min(n, b-y);
		long ans2 = (b - abs2)* (a-Math.min(a-x, n-abs2));
				
			System.out.println(Math.min(ans1, ans2));	

	}
}
}

