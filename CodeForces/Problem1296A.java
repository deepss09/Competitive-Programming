import java.util.Scanner;

public class Problem1296A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int sum = 0;
			int even = 0, odd = 0;
			int a[]= new int[n];
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++) {
			if (a[i]%2==0)
                even++;
            else
                odd++;
            sum+=a[i];
        }
			 if (sum%2==1||(even>0&&odd>0)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}

	}

