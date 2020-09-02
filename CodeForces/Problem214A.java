import java.util.Scanner;

public class Problem214A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		for(int a=0;a<=n;a++) {
			for(int b=0;b<=n;b++) {
		if((a*a)+b== n && a+(b*b) == m) {
			ans++;
		}
	}

}
		System.out.println(ans);
	}
}
