import java.util.Scanner;

public class Problem71A {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) {
    	String s = sc.next();
    	int n = s.length();
    		if(s.length() > 10) {
    			System.out.print(s.charAt(0));
    			System.out.print(s.length()-2);
    			System.out.println(s.charAt(s.length()-1));
    		}
    else {
    			System.out.println(s);
    		}
    	}
    }
}


