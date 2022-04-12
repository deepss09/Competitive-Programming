//Recursion
public class Solution {
	static int training(int day,int last,int points[][]){
		if(day == 0){
			int maxi = 0;
			for(int task = 0;task<3;task++){
				if(task!=last){
				maxi = Math.max(maxi,points[0][task]);
			}
		}
		return maxi;
	}
	int maxi =0;
		for(int task =0;task<3;task++){
			if(task!=last){
				int point = points[day][task]+training(day-1,task,points);
				maxi = Math.max(maxi,point);
			}
			
		}
		return maxi;
	}
    public static int ninjaTraining(int n, int points[][]) {

        return training(n-1,3,points);
    }

	

}
//Memoization

import java.util.*;
public class Solution {
	static int training(int day,int last,int points[][],int dp[][]){
		if(dp[day][last]!= -1) return dp[day][last];
		if(day == 0){
			int maxi = 0;
			for(int task = 0;task<3;task++){
				if(task!=last){
				maxi = Math.max(maxi,points[0][task]);
			}
		}
		return dp[day][last] = maxi;
	}
	int maxi =0;
		for(int task =0;task<3;task++){
			if(task!=last){
				int point = points[day][task]+training(day-1,task,points,dp);
				maxi = Math.max(maxi,point);
			}
			
		}
		return dp[day][last] = maxi;
	}
    public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][4];
		for (int[] row: dp)
            Arrays.fill(row, -1);

        return training(n-1,3,points,dp);
    }

	

}

//Tabulation
 public static int ninjaTraining(int n, int points[][]) {
        int dp[][] = new int[n][4];
		dp[0][0] = Math.max(points[0][1],points[0][2]);
dp[0][1] = Math.max(points[0][0],points[0][2]);
		dp[0][2] = Math.max(points[0][0],points[0][1]);
		dp[0][3] = Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
		for(int day=1;day<n;day++){
			for(int last=0;last<4;last++){
				dp[day][last] = 0;
				for(int task=0;task<3;task++){
					if(task!=last){
						int point = points[day][task]+dp[day-1][task];
						dp[day][last] = Math.max(dp[day][last],point);
					}
				}
			}
		}
		return dp[n-1][3];
	}

} //T.C = O(N*4*3) SC = O(N*4)