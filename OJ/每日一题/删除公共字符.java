package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-17
 * Time: 23:17
 */
public class 删除公共字符 {
    public static boolean contains(char ch,String del){
        for(int i = 0; i < del.length(); i++){
            char x = del.charAt(i);
            if(ch == x) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String del = scanner.nextLine();
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(contains(ch,del)){
                ret.append(ch);
            }
        }
        //输出
        System.out.println(ret);
    }
}
