package OJ.每日一题;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-02
 * Time: 20:18
 */
public class 井字棋 {
    public static boolean Judge(int[][] board,int row,int col,int sr,int sc){
        if(board[0][sc] == 1 && board[1][sc] == 1 && board[2][sc] == 1) return true; //判断列
        if(board[sr][0] == 1 && board[sr][1] == 1 && board[sr][2] == 1) return true; //判读行
        if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) return true; //判读左斜
        if(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) return true; //判读右斜
        return false;
    }
    public static boolean checkWon(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        boolean ret = false;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 1){
                    ret = Judge(board,row,col,i,j);
                }
            }
        }//for
        return ret;
    }

    public static void main(String[] args) {
        int[][] board = {{1,-1,-1},{1,1,1},{-1,-1,1}};
        boolean ret = checkWon(board);
        System.out.println(ret);
    }
}
