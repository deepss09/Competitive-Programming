import java.util.Scanner;

public class Problem1418A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long x = sc.nextLong();
		     long y = sc.nextLong();
			long k = sc.nextLong();
			long a = k*y+k-1;
			long b = x - 1;
			System.out.println(((a+b-1)/b)+k);
			
		}

	}

}
