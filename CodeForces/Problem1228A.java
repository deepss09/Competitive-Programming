import java.util.Scanner;

public class Problem1228A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int[] array = new int[10];
        boolean check;
        for (int i = l; i <= r; i++) {
          int temp = i;
          check = true;
          array = new int[10];
          while (temp > 0) {
            if (array[temp % 10] != 0) {
              check = false;
            }
            array[temp%10]++;
            temp /= 10;
          }
          if (check) {
            System.out.println(i);
            return;
          }
        }
        System.out.println(-1);
    }
}

