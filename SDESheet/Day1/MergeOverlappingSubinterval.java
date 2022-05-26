class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) //if we given a empty interval
            return res.toArray(new int[0][]); // so we return empty interval
        
        Arrays.sort(intervals,(a,b) ->a[0]-b[0]); //sort in ascending order
        
        int start = intervals[0][0];//basically it's a pair stuff
        int end = intervals[0][1];
        
        for(int i[]:intervals){//we linearly iterate in intervals
            if(i[0]<=end){ // if in intervals there are (1,3),(2,4),(4,6)
                // so that 2 should be less than 3
                end = Math.max(end,i[1]); //we finally merging it
            }
            else{
                res.add(new int[]{start,end}); //if we don't merge so add it on data structures
                start = i[0];//and initializing with start and end
                end = i[1];
            }
        }
        res.add(new int[]{start,end}); //what ever the value is that is start and end
        return res.toArray(new int[0][]); // and we converted to array and then return
    }
}