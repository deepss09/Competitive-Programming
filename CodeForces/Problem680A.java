import java.util.Arrays;
import java.util.Scanner;

public class Problem680A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t[] = new int[5];
		for(int i=0;i<5;i++){
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		int best = 0;
		for(int i = 0; i < 5; ++i) {
			if(i + 1 < 5 && t[i] == t[i+1])
				best = Math.max(best, 2 * t[i]);
			if(i + 2 < 5 && t[i] == t[i+2])
				best = Math.max(best, 3 * t[i]);
		}
		System.out.println(t[0]+t[1]+t[2]+t[3]+t[4]-best);	  
          }
	}

