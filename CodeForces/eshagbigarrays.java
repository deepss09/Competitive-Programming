import java.util.Arrays;
import java.util.Scanner;

public class eshagbigarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int i=0;
			while(i<n && a[i] == a[0]) {
				i++;
			}
			System.out.println(n-i);
	}

}
}