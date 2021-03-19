import java.util.Scanner;

public class Jugglingletters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String str;
			int[] a = new int[26];
			int i;
			for(i=0;i<n;++i)
				{
				str=sc.next();
				for(int j=0;j<str.length();++j)
					a[str.charAt(j)-'a']++;
				}
			for(i=0;i<26;++i)
				if(a[i]%n!=0)
					break;
			if(i==26)
				System.out.println("YES");
			else
				System.out.println("NO");
			}
		}
	}
