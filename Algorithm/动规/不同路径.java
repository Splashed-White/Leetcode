package Algorithm.动规;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-09
 * Time: 15:24
 */
public class 不同路径 {
    public static int uniquePaths(int m, int n) {
        //1.确定dp数组
        int[][] dp = new int[m][n]; //从(0,0)->(i,j)有dp[i][j]条路径
        //2.确定状态转移公式
        //dp[i][j] = dp[i-1][j] + dp[i][j-1];
        //3.dp数组初始化 第一行和第一列全置1
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }
        //4.确定遍历顺序 从左向右遍历
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                System.out.print("(" + i + "," + j + ")" + ":" + dp[i][j] + " ");
            }
        }
        //5.打印dp数组日志检验
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int ret = uniquePaths(3,2);
        System.out.println(ret);
    }
}






