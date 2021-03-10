import java.util.Scanner;

public class Problem1490C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long x = sc.nextLong();
			boolean ck = false;
			for(int i=1;i<Math.cbrt(x);++i) {
				long k = x-(i*i*i);
				if(Math.cbrt(k) == (int)Math.cbrt(k)) {
					ck = true;
					break;
				}
			}
			if(ck) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
