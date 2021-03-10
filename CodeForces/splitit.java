import java.util.Scanner;

public class splitit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n= sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			if(2*k+1>n)
				System.out.println("NO");
			else if(k==0)
				System.out.println("YES");
			else if(s.charAt(0)!=s.charAt(n-1))
				System.out.println("NO");
			else
			{
		int i=0;
		int j=n-1;
		while(i<=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
				break;
		}
		if(i>j)
			System.out.println("YES");
		else
			System.out.println(i<k?"NO":"YES");
		}
	}
}
}