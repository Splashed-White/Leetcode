package Algorithm.动规;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-10
 * Time: 23:48
 */
public class 使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length; i++){
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        //最后一步，如果是由倒数第二步爬，则最后一步的体力花费可以不用算
        //dp最后两位取最小的
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
