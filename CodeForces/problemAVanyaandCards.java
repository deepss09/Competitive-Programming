import java.util.Scanner;

public class problemAVanyaandCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			int q = sc.nextInt();
			sum+=q;	
			}
		sum = Math.abs(sum);
		int ans = sum/x;
		if(sum%x!=0) ans++;
		System.out.println(ans);
		}

	}
