import java.util.Scanner;

public class Problem486A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			if(n%2==0) {
				System.out.println(n/2);
			}else {
				System.out.println(-(n+1)/2);
			}
		}

	}
