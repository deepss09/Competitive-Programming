import java.util.Scanner;

public class Problem478A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
		int c = sc.nextInt();
		sum+=c;
		}
		if(sum%5==0 && sum !=0) {
			System.out.println(sum/5);
	}
		else {
			System.out.println("-1");
		}
}
}
