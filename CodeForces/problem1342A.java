import java.util.Scanner;

public class problem1342A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long x = sc.nextInt(),y = sc.nextInt();
			long a = sc.nextInt(), b = sc.nextInt();
			long total = 0;
			long min = Math.min(x, y);
			if(2*a<b) {
				total+=2 *a*min;
				total+=(Math.max(x,y)-min)*a;
			}
			else {
				total+=b*min;
				total+=(Math.max(x,y)-min)*a;
			}
			System.out.println(total);
		}
	}

}
