import java.util.Scanner;

public class Problem1535A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t-->0) {
			int s[];
			s = new int[4];
			for(int i=0;i<s.length;i++) {
				s[i] = sc.nextInt();
			}
	           int max = Math.max(s[0], s[1]);
	           int max1 = Math.max(s[2], s[3]);
	           int min = Math.min(s[0], s[1]);
	           int min1 = Math.min(s[2], s[3]);
	           if(min > max1 || max < min1) {
	        	   System.out.println("NO");
	           }else {
	        	   System.out.println("YES");
	           }
				}
	}

}
	