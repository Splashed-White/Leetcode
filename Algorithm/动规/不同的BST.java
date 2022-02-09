package Algorithm.动规;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-09
 * Time: 21:37
 */
public class 不同的BST {
    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1; //空树也是BST
        dp[1] = 1; //
        for(int i = 2; i <= n; i++){ //i=2
            for(int j = 1; j <=i; j++){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int ret = numTrees(3);
        System.out.println(ret);
    }
}

