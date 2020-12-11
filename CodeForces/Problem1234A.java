import java.util.Scanner;

public class Problem1234A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
//		int initialsum = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
      int Sum = 0;
      for(int i=0;i<n;i++) {
    	  Sum+=a[i];
      }
    	  int avg = (Sum+n-1)/n;
      System.out.println(avg);
	}
}


