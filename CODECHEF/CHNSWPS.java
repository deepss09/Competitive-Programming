import java.io.*;
import java.util.*;
public class Main
{
    static int swap(){
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- >0)
		{
		    int size = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		int min = Integer.MAX_VALUE;
		swap();
		boolean stop = false;
		for (int i = 0;i <size; i++)
		{
		    int num = sc.nextInt();
		    min = Math.min(min, num);
		    set.add(num);
		    int count = map1.getOrDefault(num,0);
		    map1.put(num, ++count);
		}
		for(int i = 0; i<size; i++){
		    int num = sc.nextInt();
		    min = Math.min(min,num);
		    set.add(num);
		    int count = map2.getOrDefault(num,0);
		    map2.put(num, ++count);
		    swap();
		}
		List<Integer> list = new ArrayList<>();
		for(int key : set){
		    int one = map1.getOrDefault(key,0);
		    int two = map2.getOrDefault(key,0);
		    int combine = one + two;
		    if(combine%2!=0){
		        stop = true;
		        swap();
		        System.out.println(-1);
		        break;
		    }
		    if (one!= two){
		        int add = (Math.abs(one - two))/2;
		        for (int i = 0; i <add; i++)
		        list.add(key);
		        swap();
		    }
		}
		if (stop){
		    continue;
		}
		Collections.sort(list);
		long result = 0;
		int n = list.size();
		for(int i= 0; i<n; i++){
		    if(min == list.get(i)){
		        n--;
		        result+=min;
		        
		    }
		    
		    else if(min*2 <= list.get(i))
		    result+=min;
		    else{
		        result+= list.get(i);
		        n--;
		    }
		}
		System.out.println(result);
	}
}
}
