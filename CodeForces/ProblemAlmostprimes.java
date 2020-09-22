import java.util.Scanner;

public class ProblemAlmostprimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[3001];
		int count = 0;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {
			if(arr[j]==0 && i%j==0) {
				arr[i]++;
			}
			}
			if(arr[i]==2)
				count++;
		}
			System.out.println(count);
	
	}
}


