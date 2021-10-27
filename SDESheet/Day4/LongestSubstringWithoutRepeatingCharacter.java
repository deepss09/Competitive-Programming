  //Time Complexity = O(2N)  space Complexity = O(n)
        Set<Character> cur = new HashSet<>();
        int left = 0;
        int right = 0;
        int len = 0;
        char currChar;
        while(right < s.length()){
            currChar = s.charAt(right);
            while(cur.contains(currChar)) cur.remove(s.charAt(left++)); //shrink the window as long as there is a repeated char
        
            cur.add(currChar);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
    
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Time Complexity = O(N)  space Complexity = O(n)
        int left = 0;
        int right = 0;
        int len = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while(right < n){
            if(map.containsKey(s.charAt(right)))
                left = Math.max(map.get(s.charAt(right))+1,left);
                
                map.put(s.charAt(right),right);
                len = Math.max(len,right-left+1);
                right++;
            
        }
         return len;
    }
    }