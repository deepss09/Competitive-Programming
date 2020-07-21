import java.util.Arrays;
import java.util.Scanner;

public class Problem1385AThreePairwiseMaximum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t>0){
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            int z = sc.nextInt();
	            int[] arr = new int[3];
	            int a,b,c;
	            arr[0] = x;
	            arr[1] = y;
	            arr[2] = z;
	            Arrays.sort(arr);
	            
	            if(arr[0]<arr[2] && arr[1]<arr[2]){
	                System.out.println("No");
	            }
	            else{
	                System.out.println("Yes");
	                System.out.println(arr[0] + " " + arr[2] + " " + 1);
	            }
	            t--;
	        }
	    }
}
