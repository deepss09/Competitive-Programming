import java.util.Scanner;

public class Problem707A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][]img = new char[n][m];
		String s = "#Black&White";
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				img[i][j] = sc.next().charAt(0);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
            if(img[i][j]!='B' && img[i][j] != 'W' && img[i][j]!='G') {
            	s = "#Color";
            	break;
            }
	}

}
		System.out.println(s);
	}
}
