package GoogleKickStartPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int count = 0;
        while(t-->0){
            count++;
            int N = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int arr[] = new int[N];

            for(int i=0;i<arr.length;i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);
            int max = 0;
            for(int i=1;i<arr.length;i++){
                if(max + arr[i] <= B){
                  System.out.println("Case #" + count + ": " + i);
                }
                else{
                    max += arr[i];
                }
                System.out.println("Case #" + count + ": " + N);
            }
        }
    }
}