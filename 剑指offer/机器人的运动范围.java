package 剑指offer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-09
 * Time: 3:15
 */
public class 机器人的运动范围 {
    public static int add(int value){
        int sum = 0;
        while(value != 0){
            sum += value % 10;
            value = value / 10;
        }
        return sum;
    }
    public static int movingCount(int m, int n, int k) {
        int ret = 0;
        if(m == 1 && n == 1) return 0;
        int[][] grid = new int[m-1][n-1];
        int row = m;
        int col = n;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(add(i)+add(j) <= k){
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int m = 16;
        int n = 8;
        int k = 4;
        int ret = movingCount(m,n,k);
        System.out.println(ret);
    }
}
