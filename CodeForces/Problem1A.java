import java.util.Scanner;
public class Problem1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	long n = sc.nextLong();
        	long m = sc.nextLong();
        	long a = sc.nextLong();
        	long total = ((m+a-1)/a) * ((n+a-1)/a);
        
        System.out.println(total);
	}

}
