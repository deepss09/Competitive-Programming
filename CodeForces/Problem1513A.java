import java.util.Scanner;

public class Problem1513A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			arrayPeak(n,k);
		}
	}

	private static void arrayPeak(int n, int k) {
		if(k>(n-1)/2) {
			System.out.println(-1);
		}else {
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = i+1;
		}
		for(int i=0;i<k;i++) {
			int temp = a[2*i+1];
			a[2*i+1] = a[2*i+2];
			a[2*i+2] = temp;
		}
		
		for (int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
		}
	}
}