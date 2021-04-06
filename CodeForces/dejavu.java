import java.util.Scanner;

public class dejavu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			String a = s + "a";
			String b = "a" + s;
			if(!Palindrome(a)) {
				System.out.println("YES");
				System.out.println(a);
			}
			else if(!Palindrome(b)) {
				System.out.println("YES");
				System.out.println(b);
			}else {
				System.out.println("NO");
			}
		}

	}
  private static boolean Palindrome(String s) {
	  boolean ispal = true;
	  int n = s.length();
	  for(int i=0,j=n-1;i<j;i++,j--) {
		  if(s.charAt(i)!=s.charAt(j)) {
				ispal = false;
				break;
			  
		  }
		 
	  }
	return ispal;
  }
}
