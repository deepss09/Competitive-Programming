import java.util.ArrayList;
import java.util.Scanner;

public class Problem1382C1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            ArrayList<Integer> al = new ArrayList<>();
 
            for(int i = 0; i < N; i++) {
                if(A.charAt(i) != B.charAt(i)) {
                    if(i == 0)
                        al.add(1);
                    else {
                        al.add(i + 1);
                        al.add(1);
                        al.add(i + 1);
                    }
                }
            }
 
            System.out.print(al.size() + " ");
            for(int i = 0; i < al.size(); i++)
                System.out.print(al.get(i) + " ");
 
            System.out.println();
        }
    }
}