import java.util.Scanner;

public class Problem1469A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		 String s = sc.next();
			if(s.length()%2 == 1 || s.length()-1  == '('|| s.charAt(0) == ')' ){
				System.out.println("NO");
				}
			else {
				System.out.println("YES");
			}
			}
		

	}

}
