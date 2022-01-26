package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-26
 * Time: 14:52
 */
public class 判断回文 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int len = str1.length();
        int count = 0;
        for(int i = 0; i <= len; i++){
            String s = str1.substring(0,i)+str2+str1.substring(i,len);
            StringBuilder ret = new StringBuilder(s);
            if(ret.reverse().toString().equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
