import java.util.Scanner;
import java.util.Stack;


public class Problem1234B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //the no of friends
        int k = sc.nextInt(); //the size of conversation shown on screen
        int no;
        Stack<Integer> ph = new Stack<>();
        for (int i = 0; i < n; i++) {
            no = sc.nextInt();
            if(!(ph.contains(no))){
                if(ph.size() == k){
                    ph.remove(0);
                    ph.add(no);
                }else{
                  ph.add(no);
                }
            }else{
                continue; //no order changes and you just read the message
            }
        }

        String ans = "";
        //printing the elements of stack
        System.out.println(ph.size());
        while(!ph.isEmpty()){
            ans = ans+ph.pop()+" ";
        }
        System.out.println(ans.trim());
    }
}


