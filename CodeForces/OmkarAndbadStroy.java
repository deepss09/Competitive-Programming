import java.util.Scanner;

public class OmkarAndbadStroy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n+1];
			int count = 0;
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
                if(a[i] < 0) 
                	count = 1;
                }
                if(count == 1) {
                	System.out.println("NO");
                }else {
                	System.out.println("YES");
                	System.out.println("101");
                	
                	for(int j=0;j<=100;j++) {
                		System.out.print(j+" ");
                	}
     
                }
          }
        	 
          }

}
