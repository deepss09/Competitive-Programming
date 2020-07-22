import java.util.Scanner;

public class Problem1385C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
        	int n = sc.nextInt();
        	int arr[] = new int[n];
        	for(int i = 0;i<n;i++) {
        		arr[i] = sc.nextInt();
        	}
        	int pos = n - 1;
        	while(pos >= 1 && arr[pos - 1] >= arr[pos] )
        		pos--;
        	while(pos >=1 && arr[pos - 1] <= arr[pos])
        		pos--;
        	System.out.println(pos);
        }
	}

}
