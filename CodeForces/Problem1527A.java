import java.util.Scanner;

public class Problem1527A {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0) {
		  int n = sc.nextInt();
		  int a=(int)(Math.log(n)/Math.log(2));
          System.out.println((int)Math.pow(2,a)-1);
	  }

	}

}
