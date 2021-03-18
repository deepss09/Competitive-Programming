import java.util.Scanner;

public class Problem1476A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
		long c = (n+k-1)/k;
			k = k *c;
			System.out.println((k+n-1)/n);
		}
	}
}
			