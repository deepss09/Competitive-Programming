import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			boolean good = true;
			for(int i = 1; i < n; i++) {
				if(Math.abs(a[i] - a[i-1]) > 1) {
					good = false;
					break;
				}
			}
			System.out.println(good ? "YES" : "NO");
		}
	}
}



