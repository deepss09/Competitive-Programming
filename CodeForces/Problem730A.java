import java.util.Scanner;

public class Problem730A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ka = 0;
		int kd = 0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == 'A') ka++; else kd++;}
			if(ka > kd) {
				System.out.println("Anton");
			}
			else if(ka<kd) {
				System.out.println("Danik");
			}
			else {
				System.out.println("Friendship");
			}
		}

	}
	

