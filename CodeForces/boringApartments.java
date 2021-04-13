import java.util.Scanner;

public class boringApartments {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			int ans = 10 * (x % 10) - 10;
			String str = x + "";
			int len = str.length();
			ans += (len*(len+1))/2;
			System.out.println(ans);
		}

	}

}
