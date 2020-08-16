import java.util.Scanner;

public class BobinueLikesColorballs {

	public static boolean check(int r,int g,int b, int w) {
		return(r%2+g%2+b%2+w%2 > 1)?false:true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			if(check(r,b,g,w)) {
				System.out.println("Yes");
			}
			else if(r>0 && g>0 && b>0 && check(r-1,g-1,b-1,w+1)){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
