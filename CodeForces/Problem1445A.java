import java.util.Arrays;
import java.util.Scanner;

public class Problem1445A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (; t > 0; t--) {
            int n = in.nextInt(), x = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            boolean abx = true;
            for (int i = 0; i < n; i++) {
                if (a[i] + b[n - i - 1] > x) {
                    abx = false;
                    break;
                }
            }
 
            System.out.println(abx == false ? "NO" : "YES");
        }
        in.close();
    }
 
}



