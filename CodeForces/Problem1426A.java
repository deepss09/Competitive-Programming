import java.util.Scanner;

public class Problem1426A {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      if(n == 1|| n== 2) {
    	  System.out.println(1);
      }
      else {
    	  System.out.println(((n-3)/x)+2);
      }
	}

}
}
