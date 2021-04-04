import java.util.Scanner;

public class doubleendedstring {

	 static int LCSubStr(char x[], char y[],
             int m, int n)
{
// Create a table to store
// lengths of longest common
// suffixes of substrings.
// Note that LCSuff[i][j]
// contains length of longest
// common suffix of
// X[0..i-1] and Y[0..j-1].
// The first row and first
// column entries have no
// logical meaning, they are
// used only for simplicity of program
int LCStuff[][] = new int[m + 1][n + 1];

// To store length of the longest
// common substring
int result = 0;

// Following steps build
// LCSuff[m+1][n+1] in bottom up fashion
for (int i = 0; i <= m; i++)
{
for (int j = 0; j <= n; j++)
{
    if (i == 0 || j == 0)
        LCStuff[i][j] = 0;
    else if (x[i - 1] == y[j - 1])
    {
        LCStuff[i][j]
            = LCStuff[i - 1][j - 1] + 1;
        result = Integer.max(result,
                             LCStuff[i][j]);
    }
    else
        LCStuff[i][j] = 0;
}
}
return result;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String X = sc.next();
			String Y = sc.next();
			int m = X.length();
			int n = Y.length();
			 int ls= LCSubStr(X.toCharArray(), Y.toCharArray(), m, n);
			 System.out.println(m-ls+n-ls);
			 
					}
				}
					
			
		}

	


