package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: X2148
 * Date: 2022-04-11
 * Time: 16:23
 */
public class 统计回文 {
    public static boolean judge(String str){
        StringBuilder temp = new StringBuilder(str);
        String s = temp.reverse().toString();
//        System.out.println(str);
//        System.out.println(s);
        if(str.equals(s)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int count = 0;
        String str = null;
        str = B + A;
        if(judge(str)){
            count++;
        }
        for(int i = 0; i < A.length()-1; i++){
            str = A.substring(0,i+1) + B + A.substring(i+1,A.length());
//            System.out.println(str);
            if(judge(str)){
                count++;
            }
        }
        str = A + B;
        if(judge(str)){
            count++;
        }
        System.out.println(count);
    }
}
