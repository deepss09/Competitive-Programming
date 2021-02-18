import java.util.Scanner;

public class Problem1478A {

	static Scanner scr = new Scanner(System.in);
	public static void main(String[] args) {
		int t=scr.nextInt();
		while(t-->0) {
			solve();
		}
	}
	static void solve(){
		int n=scr.nextInt();
		int count[]=new int[n+1];
		int max=-1;
		for(int i=0;i<n;i++) {
			int ele=scr.nextInt();
			count[ele]++;
			max=Math.max(max,count[ele]);
		}
		System.out.println(max);
	}
}
