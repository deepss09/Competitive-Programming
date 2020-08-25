import java.util.Scanner;

public class Problem353A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s1 = 0;
		int s2 = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a%2 != b%2) {
				count++;
			}
			s1+=a;
			s2+=b;
			if(a%2==0 && b%2==0) {
				System.out.println('0');
			}
			else if(count>0 && count%2==0) {
				System.out.println('1');
			}
			else {
				System.out.println("-1");
			}
		}

	}

}
