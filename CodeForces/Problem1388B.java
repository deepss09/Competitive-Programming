import java.util.Scanner;

public class Problem1388B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int x = (n+3)/4;
			for(int i=0;i<n-x;++i) {
				System.out.print("9");
			}
			for(int i=0;i<x;++i) {
				System.out.print("8");
			}
			System.out.println();
		}

	}

}
