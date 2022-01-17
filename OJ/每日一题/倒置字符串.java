package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-17
 * Time: 23:08
 */
public class 倒置字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder ret = new StringBuilder();
        String[] array = str.split(" ");
        for(int i = array.length - 1; i >= 0; i--){
            ret.append(array[i]);
            ret.append(" ");
        }
        //输出
        System.out.println(ret);
    }
}
