import java.util.Scanner;

public class Problem1405B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long sum = 0;
			for(int i=0;i<n;++i) {
				int a = sc.nextInt();
				sum +=a;
				if(sum < 0) {
					sum = 0;
				}
				System.out.println(sum);
			}
		}

	}

}
