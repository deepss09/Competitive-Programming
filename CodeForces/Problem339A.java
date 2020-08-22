import java.util.Arrays;
import java.util.Scanner;

public class Problem339A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.next().split("\\+");
		Arrays.sort(a);
		System.out.println(String.join("+", a));
		sc.close();
	}
 


	}

