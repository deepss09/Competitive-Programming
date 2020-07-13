import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int count = 0;

        while(t-->0)
        {
            count++;

            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            
            for(int i = 0;i<n;i++)
            {
                arr[i] = Integer.parseInt(br.readLine());
            }
            
            int k = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] < arr[j+1] || arr[k] < arr.length || arr[j] < arr[j+1]){
                k++;
            }
        }
        System.out.println("Case #"+count+": "+k);
    }
}
}