import java.util.Scanner;
import static java.lang.Math.min;
public class Problem599A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		
		int max = d1+d1+d2+d2;
		int max1 = d1+d3+d3+d2;
		int max2 = d2+d3+d3+d2;
		int max3 = d1+d2+d3;
		
		 System.out.println(min(min(min(max,max1),max2),max3));

	}

}
