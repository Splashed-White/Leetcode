package 剑指offer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-05
 * Time: 16:51
 */
public class 矩阵中的路径 {
    static int[][] position = {{1,0},{0,1},{-1,0},{0,-1}};
    public static boolean exist(char[][] board, String word){
        char[] array = word.toCharArray();
        int row = board.length;
        int col = board[0].length;
        //int[][] book = new int[row][col];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                //以棋盘中的每一个格子为起点搜索
                if(DFS(board,row,col,i,j,new int[row][col],array,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DFS(char[][] board,int row,int col,int sr,int sc,int[][] book,char[] array,int start){
        if(board[sr][sc] != array[start]){
            return false;
        }
        //字符串已经匹配完
        if(start == array.length - 1){
            return true;
        }
        book[sr][sc] = 1;
        for(int i = 0; i < 4; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            if(new_sr < 0 || new_sr >= row || new_sc < 0 || new_sc >= col || book[new_sr][new_sc]==1){
                continue;
            }
            if(DFS(board,row,col,new_sr,new_sc,book,array,start+1)){
                return true;
            }
        }
        book[sr][sc] = 0;
        return false;
    }

    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        String word = "ABCCED";
//        char[][] board = {{'A','A'}};
//        String word = "AAA";
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','F'}};
        String word =    "ABCESEEEFS";
        boolean ret = exist(board,word);
        System.out.println(ret);
    }
}
