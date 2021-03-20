import java.util.Scanner;

public class Problem1492A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long p = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			 System.out.println(Math.min((a - p % a) % a, Math.min((b - p % b) % b, (c - p % c) % c)));
			    
		}

	}

}
