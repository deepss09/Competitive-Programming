
	import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
 
public class Problem1496B {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt(), k = sc.nextInt();
			HashSet<Integer> arr = new HashSet<>();
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<n; i++) {
				int val = sc.nextInt();
				arr.add(val);
				max = Math.max(max, val);
			}
			
			int mex = 0;
			
			while(mex <= Integer.MAX_VALUE) {
				if(!arr.contains(mex)) {
					break;
				}
				mex++;
			}
			
			int unique = arr.size();
			
			if(mex < max && k > 0) {
				int avg = (int)Math.ceil((((double)mex + (double)max) / 2));
				if(!arr.contains(avg)) {
					unique++;
				}
			}
			else if(mex > max && k > 0) {
				unique += k;
			}
			
						
			System.out.println(unique);
		}
		
		sc.close();
	}
 
}