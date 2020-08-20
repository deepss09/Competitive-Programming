import java.util.Scanner;

public class Problem69A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			int x [] = new int[n];
			int y[] = new int[n];
			int z[] = new int[n];
			int sum1 = 0, sum2 = 0, sum3 = 0;
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				z[i] = sc.nextInt();
	}
      for(int i=0;i<n;i++) {
    	  sum1+= x[i];
    	  sum2+= y[i];
    	  sum3+= z[i];
      }
      
      if(sum1 == 0 && sum2 == 0 && sum3 == 0) {
    	  System.out.println("YES");
      }
      else {
    	  System.out.println("NO");
      }
	}

}
