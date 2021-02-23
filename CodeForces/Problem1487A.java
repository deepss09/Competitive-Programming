import java.util.Arrays;
import java.util.Scanner;

public class Problem1487A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			int m = 0;
			Arrays.sort(a);
			int min = a[0];
			for(int i=0;i<n;i++) {
				if(a[i] != min) {
					m++;
				}
			
			}
			System.out.println(m);
			}
	
			
		}

	}


