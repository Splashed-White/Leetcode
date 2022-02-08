package 剑指offer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-09
 * Time: 3:15
 */
public class 机器人的运动范围 {
    private static int count;
    public static int[][] position = {{1,0},{-1,0},{0,1},{0,-1}};
    public static int add(int value){
        int sum = 0;
        while(value != 0){
            sum += value % 10;
            value = value / 10;
        }
        return sum;
    }
    public static int movingCount(int m, int n, int k) {
        boolean[][] book = new boolean[m][n];
        DFS(m,n,book,0,0,k);
        return  count;
    }
    public static void DFS(int m, int n, boolean[][] book, int sr, int sc, int k){
        if(sr < 0 || sc < 0 || sr >= m || sc >= n || book[sr][sc] == true) return;
        if(add(sr) + add(sc) > k) return;
        book[sr][sc] = true;
        count++;
        for(int i = 0; i < 4; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            DFS(m,n,book,new_sr,new_sc,k);
        }

    }

    public static void main(String[] args) {
        int m = 16;
        int n = 8;
        int k = 4;
        int ret = movingCount(m,n,k);
        System.out.println(ret);
    }
}
