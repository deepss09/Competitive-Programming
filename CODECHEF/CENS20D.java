import java.util.Scanner;

public class CENS20D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n+1];
			int b = 0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			if(n == 1) {
				System.out.println(0);
			}
			else {
	        for (int i = 0; i < n; i++) { 
	            for (int j = i + 1; j < n; j++) 
	                if (i < j){
	                    if((a[i]&a[j]) == a[i]){
	                        b++;
	        } 
	               
	        }
		}
	        System.out.println(b);
		    } 
	}
}
}