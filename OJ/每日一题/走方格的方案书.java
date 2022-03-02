package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-02
 * Time: 10:38
 */

/**
 * 审错题了，题目要求按格子线走，该代码实现的是按格子走
 */
//public class 走方格的方案书 {
//    public static int[][] position = {{0,1},{1,0}};
//    public static int count = 0;
//    public static int DFS(int[][] grid, int row, int col, int sr, int sc){
//        grid[sr][sc] = 1;
//        if (sr == row-1 && sc == col-1){
//            count++;
//            //棋盘全部清空
//            grid[sr][sc] = 0;
//        }
//        for(int i = 0; i < 2; i++){
//            int new_sr = sr + position[i][0];
//            int new_sc = sc + position[i][1];
//            if(new_sr >= row || new_sr < 0 || new_sc >= col || new_sc < 0){ //新坐标范围不合法
//                continue;
//            }
//            if(grid[new_sr][new_sc] == 0){
//                DFS(grid,row,col,new_sr,new_sc); //就向新坐标渲染，即下一层DFS
//            }
//        }
//        grid[sr][sc] = 0;
//        return count;
//    }
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
////        int m = scanner.nextInt();
//        int n = 3;
//        int m = 3;
//        int[][] grid = new int[n][m];
//        int ret = DFS(grid,n,m,0,0);
//        System.out.println(ret);
//    }
//}

/**
 * 将右下角点看作(0,0),左上角点看作(row,col),每走一步就相当于坐标发生变动
 * 向右走一步坐标 -> (row,col-1)
 * 向左走一步坐标 -> (row-1,col)
 * 直到row或者col为0表示碰到了边界，那么此时只有一条路可走，所以返回1,如此递归得到结果
 */
public class 走方格的方案书{
    public static int helper(int row,int col){
        if(row == 0 && col != 0) return 1;
        if(row != 0 && col == 0) return 1;
        return helper(row-1,col) + helper(row,col-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int ret = helper(row,col);
        System.out.println(ret);
    }
}