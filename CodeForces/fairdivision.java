import java.util.Scanner;

public class fairdivision {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        while (cases --> 0) {
            int length = s.nextInt();
            int one = 0;
            int two = 0;
            for(int i=0; i<length; i++) {
                int current = s.nextInt();
                if(current == 1) {
                    one++;
                }
                else {
                    two++;
                }
            }
            if((one!=0 && one%2==0)||(one==0 && two%2==0)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
 
