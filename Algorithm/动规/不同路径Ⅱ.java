package Algorithm.动规;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-09
 * Time: 16:35
 */
public class 不同路径Ⅱ {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        //1.确定dp数组
        int[][] dp = new int[row][col];
        //2.确定状态转移方程
        //dp[i][j] = dp[i-1][j] + dp[i][j-1];
        //3.dp数组初始化
        for(int i = 0; i < row; i++){
            if(obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }
        for(int j = 0; j < col; j++){
            if(obstacleGrid[0][j] == 1) break;
            dp[0][j] = 1;
        }
        //4.确定遍历顺序
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        //5.打印dp数组日志检验
        return dp[row - 1][col - 1];
    }
}
