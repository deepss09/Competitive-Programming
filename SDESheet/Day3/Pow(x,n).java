class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long neg = n;
        if(neg<0) neg = -1*neg;  //if n is negative then make it positive
        while(neg>0){
            if(neg%2 == 0){    //even
                 x = x*x;
                 neg = neg/2;
            }else if(neg%2 == 1){   //odd
                ans = ans*x;
                neg--;
            }
        }
        if(n<0) ans = (double)1.0/ (double)ans;
        return ans;
    }
    
}
//Time Complexity = O(log2n)