import java.util.Scanner;

public class Problem734B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int k5 = sc.nextInt();
		int k6 = sc.nextInt();
		int n256 = Math.min(k2,Math.min( k5,k6));
		int n32 = Math.min(k3,k2-n256);
		System.out.println(32*n32+256*n256);

	}

}
