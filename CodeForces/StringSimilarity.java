import java.util.Scanner;

public class StringSimilarity {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			String ans="";
			for(int i=0;i<2*n-1;i+=2) 
			ans=ans+(s.charAt(i));
			
			System.out.println(ans);
		}
	}
}
//		
//}
//
//}
//			int n = sc.nextInt();
//			String s[] = new String[n];
//			for(int i=0;i<n;i++) {
//				s[i] = sc.next();
//				System.out.println(s[n-1]);
//			}
//		}
//	}
//}