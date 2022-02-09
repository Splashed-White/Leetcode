package Algorithm.动规;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-09
 * Time: 18:11
 */
public class 整数拆分 {
    public static int integerBreak(int n) {
        //1.确定dp数组
        int[] dp = new int[n+1]; //拆分i可以得到的最大乘积为dp[i]
        //2.确定状态转移方程
        //dp[i] = max(dp[i],j*(i-j),dp[i-j]*j);
        //3.dp数组初始化
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        //4.确定遍历顺序
        for(int i = 3; i <= n; i++){
            for(int j = 1; j < i-1; j++){
                //j*(i-j)代表把i拆分为j和i-j两个数相乘
                //j*dp[i-j]代表把i拆分成j和继续把(i-j)这个数拆分，取(i-j)拆分结果中的最大乘积与j相乘


                //System.out.print("dp[i] = " + dp[i] + " j*(i-j) = " + j*(i-j) + " dp[i-j]*j = " + dp[i-j]*j + " ");
                dp[i]= Math.max(dp[i],Math.max(j*(i-j),dp[i-j]*j)); //Math.max()参数个数 = 2
                //dp[i]= Math.max(dp[i],j*(i-j));
                //System.out.print(dp[i] + " ");
            }
            //System.out.println(" ");
        }
        //5.打印dp数组日志检验
        return dp[n];
    }

    public static void main(String[] args) {
        int ret = integerBreak(10);
        System.out.println(ret);
    }
}
