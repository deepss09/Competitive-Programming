import java.util.Scanner;

public class PleasantPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
             int n = sc.nextInt();
			int[] a = new int[n + 1];
			int count = 0;
			
			for (int i = 1 ;i <= n; i++) {
				a[i] = sc.nextInt();
			}
			
			for (int i = 1; i <= n; i++) {
				for (int j = a[i] - i; j <= n;j += a[i]) {
					if ((j > 0) && ((long) a[i] * a[j] == (long) i + j) && (i < j))
   			          count++;
				}
			}
			System.out.println(count);
        }
   }
}