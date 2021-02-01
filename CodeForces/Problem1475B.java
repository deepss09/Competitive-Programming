import java.util.Scanner;

public class Problem1475B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int rem = n/2020;
			if(n>=2020 && rem>=n%2020){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
