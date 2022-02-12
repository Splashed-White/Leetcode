package Algorithm.动规;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-12
 * Time: 23:00
 */

/**
 * 二维dp数组 01背包
 */
public class o1背包 {
    public static void testweightbagproblem(int[] weight, int[] value, int bagsize){
        int row = weight.length;
        int col = bagsize;
        //1.定义dp数组
        int[][] dp = new int[row+1][col+1]; //取出物品i放入容量为j的背包中，总价值为dp[i][j]
        //2.状态转移方程
        //dp[i][j] = max(dp[i-1][j],dp[i-1][j-weight[i]] + value[i]); //不放 + 放
        //3.初始化
        for(int i = 0; i < row; i++){
            dp[i][0] = 0;
        }
        //4.遍历顺序：先遍历物品，再遍历背包容量
        for(int i = 1; i<= row; i++){
            for(int j = 1; j <= col; j++){
                if (j < weight[i-1]){ //当前包的容量比该商品体积小，那么此时没法取到，即V(i,j)=V(i-1,j);
                    dp[i][j] = dp[i - 1][j];
                }else{ //当前包的容量比该商品大，可是取仍是不取，固然是选择价值大的啦。
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i-1]);
                }
            }
        }
        //打印dp数组
        for (int i = 0; i <= row; i++){
            for (int j = 0; j <= bagsize; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        testweightbagproblem(weight, value, bagsize);
    }
}
