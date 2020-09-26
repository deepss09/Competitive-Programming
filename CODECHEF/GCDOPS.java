import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			int flag = 0;
			for(int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int[] brr = new int[n];
			for(int i = 0; i < n; i++) {
				brr[i] = i+1;
			}
			for(int i = 0; i < n; i++) {
				if(brr[i] % arr[i] == 0) {
					continue;
				}
				else {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}