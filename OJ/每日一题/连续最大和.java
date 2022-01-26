package OJ.每日一题;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-24
 * Time: 17:53
 */

import java.util.Scanner;

/**
 * 经典动规问题
 * 状态方程：max(dp[i]) = getMax(max(dp[i-1])+dp[i],dp[i]);
 * eg:array = [-3,-1,2,1]
 * array = dp
 * max(dp[i-1]) = sum
 */
public class 连续最大和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int sum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            sum = Math.max(sum + array[i],array[i]);
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
