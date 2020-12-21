import java.util.Scanner;

public class Problem1459A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String r,b;
			r = sc.next();
			b = sc.next();
			int ac = 0;
			int bc = 0;
			for(int i=0;i<n;i++) {
				if(r.charAt(i) > b.charAt(i)) {
					ac++;
				}else if(r.charAt(i) < b.charAt(i)) {
					bc++;
				}
				
			}
			if(ac > bc) {
				System.out.println("RED");
			}else if(bc > ac) {
				System.out.println("BLUE");
			}else {
				System.out.println("EQUAL");
			}
		}

	}

}
