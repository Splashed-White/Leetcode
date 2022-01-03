package Algorithm.回溯;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-18
 * Time: 14:35
 */
public class 甲板上的战舰 {
    //DFS搜索，同时遍历过的格子标记为'Y'
    public int[][] position = {{1,0},{0,1}};
    public int countBattleships(char[][] board) {
        int result = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.' || board[i][j] == 'Y'){
                    continue;
                }else{
                    DFS(board,i,j);
                    result++;
                }
            }
        }
        return result;
    }
    public void DFS(char[][] board,int sr, int sc){
        board[sr][sc] = 'Y';
        //判断两个方向即可
        for(int i = 0; i < 2; i++){
            int new_sr = sr + position[i][0];
            int new_sc = sc + position[i][1];
            if(new_sr < 0 || new_sc < 0 || new_sr >= board.length || new_sc >= board[0].length) continue;
            if(board[new_sr][new_sc] == 'Y' || board[new_sr][new_sc] == '.') continue;
            DFS(board,new_sr,new_sc);
        }
    }
}
