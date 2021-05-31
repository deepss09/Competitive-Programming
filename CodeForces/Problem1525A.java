import java.util.Scanner;

public class Problem1525A {
	static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a%b);
    }
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int k = sc.nextInt();
			int g = gcd(k,100-k);
			int x = k/g;
			int y = (100-k)/g;
			System.out.println(x+y);
			
		}

	}

}
