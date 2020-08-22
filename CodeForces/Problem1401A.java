import java.util.Scanner;

public class Problem1401A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n <= k) {
				System.out.println(k-n);
			}
			else {
				System.out.println((n-k)%2);
			}
		}

	}

}
