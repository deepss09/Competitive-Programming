import java.util.Scanner;

public class BadUglyNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++)
        {
            int n = input.nextInt();
            if(n==1)
                System.out.println("-1");
            else
                {
                    System.out.print("2");
                    for(int j=1; j<n; j++)
                        System.out.print("3");
                    System.out.println();
                }
                
        }
    }
}