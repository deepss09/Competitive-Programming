import java.util.Scanner;

public class xySequence {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
		  while(t-->0) {
		  long n = sc.nextLong();
		  long b = sc.nextLong();
		  long x = sc.nextLong();
		  long y = sc.nextLong();
		  long result = 0, deep = 0;
		  for(long i=0;i<n;i++) {
			  if(deep+x>b) {
				  result+=(deep-y);
				  deep-=y;
			  }
			  else {
				  result+=(deep+x);
				  deep+=x;
			  }
		  }
		  System.out.println(result);
}
	}
}
