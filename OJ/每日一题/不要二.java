package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-22
 * Time: 8:32
 */
public class 不要二 {
    //找规律：下一个不能放蛋糕的位置就是距离它两行或者两列的位置
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        boolean[][] book = new boolean[row][col];
        int count = 0;
        for (int i = 0; i < row; i++) {
            if(i % 4 == 0 || i % 4 == 1){
                for (int j = 0; j < col; j++) {
                    if(j % 4 == 0 || j % 4 == 1){
                        book[i][j] = true;
                    }
                }//forj
            }else{
                for (int j = 0; j < col; j++) {
                    if(j % 4 == 2 || j % 4 == 3){
                        book[i][j] = true;
                    }
                }
            }
        }//fori
        //遍历统计
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(book[i][j] == true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
