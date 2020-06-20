//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());
        for (int i = 0; i < T; i++){
            int count = 0;
            int n = Integer.parseInt(input.readLine());
            int sum = 1;
            while (n != 0){
                if ((n % 10) == 4){
                    count++;
                }
                n = n/10;
            }
            System.out.println(count);
        }
    }
}