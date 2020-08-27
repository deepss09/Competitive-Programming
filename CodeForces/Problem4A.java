import java.util.Scanner;

public class Problem4A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int sum = 0;
		if(w%2==0) {
			sum+=(w/2);
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
