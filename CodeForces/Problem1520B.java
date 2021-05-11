import java.util.Scanner;

public class Problem1520B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int x = (int)Math.log10((double)n);
			int temp = 1;
			for(int i=0;i<x;i++) {
				 temp = temp*10 + 1;
	           }
	           System.out.println(x*9 + n/temp);
			}
			
			
		}

	}

