import java.util.Scanner;

public class Problem130AThreeIndices {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int i = 0; i < t; i++)
	        {
	            int n = sc.nextInt();
	 
	            int [] p = new int [n];
	            for(int j = 0; j < p.length; j++)
	                p [j] = sc.nextInt();
	 
	            solve(p);
	        }
	    }
	 
	    public static void solve(int [] p)
	    {
	        for(int i = 0; i < p.length - 2; i++)
	        {
	            if(p [i] < p [i + 1] && p [i + 1] > p[i + 2])
	            {
	                System.out.println("YES");
	                System.out.println((i + 1) + " " + (i + 2) + " " + (i + 3));
	                return;
	            }
	        }
	 
	        System.out.println("NO");
	    }
	}
