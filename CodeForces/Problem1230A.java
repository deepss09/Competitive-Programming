import java.util.Arrays;
import java.util.Scanner;

public class Problem1230A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= new int[4];
		int one = 0;
		int two = 0;
		int sum = 0;
		for(int i=0;i<4;i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		if (array[0] + array[3] == array[1] + array[2] || array[0] + array[1] + array[2] == array[3] || array[0] + array[1] == array[2] + array[3]) {
    		  System.out.println("YES");
		}
		else {
    	  System.out.println("NO");
      }
	}
}

