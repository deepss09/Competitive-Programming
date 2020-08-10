import java.util.Scanner;

public class Problem1374A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
			if(n-n%x+y <=n) {
				System.out.println(n-n%x+y);
			}
			else {
				System.out.println(n-n%x-(x-y));
			}
		}

	}

}
