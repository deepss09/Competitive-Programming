/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int t = Integer.parseInt(br.readLine());
			while(t-->0) {
				int n = Integer.parseInt(br.readLine());
				String inp1[] = br.readLine().split(" ");
				long a[] = new long[n];
				long maxVal =0;
				long max = Long.MIN_VALUE;
				for(int i=0;i<n;i++) {
					a[i] = Long.parseLong(inp1[i]);
					maxVal = Math.max(maxVal, a[i]);
				}
				if(n>100) {
					for(int i=0;i<n;i++) {
						long temp = Math.abs(solve(maxVal,a[i]));
						max = Math.max(max,temp);
					}
				}else {
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							max = Math.max(max, Math.abs(solve(a[i],a[j])));
						}
					}
				}
				
				System.out.println(max);
			}
		}catch(Exception e) {
			return;
		}
	}
	public static long solve(long x, long y) {
		
		String binx = Long.toBinaryString(x);
		String biny = Long.toBinaryString(y);
		String binXplusY = binx + biny;
		String binYplusX = biny + binx;

		Long a = Long.valueOf(binXplusY, 2);
		Long b = Long.valueOf(binYplusX, 2);
		
		return a-b;
	}
}