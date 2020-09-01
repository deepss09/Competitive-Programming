import java.util.Arrays;
import java.util.Scanner;

public class Problem768A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
			int arr[] = new int[t];
			for(int i=0;i<t;i++) {
              arr[i] = sc.nextInt();
	}
			int count = 0;
			Arrays.sort(arr);
			for(int i=0;i<t-1;i++) {
				if(arr[i]>arr[0] && arr[i] < t-1) {
					count++;
				}
			}
				System.out.println(count);
			}
	}