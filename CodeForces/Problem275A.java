import java.util.Scanner;

public class Problem275A {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int a[][] = new int[5][5];
	        for (int i = 1; i <= 3; i++)
	            for (int j = 1; j <= 3; j++)
	                a[i][j] = sc.nextInt();
	        for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= 3; j++) {
	                if ((a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i - 1][j] + a[i][j - 1]) % 2 == 0)
	                    System.out.print("1");
	                else System.out.print("0");
	            }
	            System.out.println();
	        }
	    }
	}
