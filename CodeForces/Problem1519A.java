import java.util.Scanner;

public class Problem1519A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int r = sc.nextInt();
			int b = sc.nextInt();
			int d = sc.nextInt();
			if(r/b == 0){
				if((b+r-1)/r-1<=d){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
			else{
				if((b+r-1)/b-1<=d){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}
}