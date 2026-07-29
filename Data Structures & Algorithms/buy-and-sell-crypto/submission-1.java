class Solution {
    static int dp[][];
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[n][3];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,0,prices);
    }
    static int solve(int i,int t,int arr[]){
        if(i>=arr.length||t==2)return 0;
        int a=0,b=0;
        if(dp[i][t]!=-1)return dp[i][t];
        if(t==0){
            a=-arr[i]+solve(i+1,1,arr);
            b=solve(i+1,t,arr);
        }
        if(t==1){
            a=arr[i]+solve(i+1,2,arr);
            b=solve(i+1,t,arr);
        }
        return dp[i][t]=Math.max(a,b);
    }
}