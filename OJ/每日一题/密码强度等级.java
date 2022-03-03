package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-03
 * Time: 9:29
 */
public class 密码强度等级 {
    public static String GetScore(String str){
        int score = 0;
        //长度
        int len = str.length();
        if(len <= 4){
            score += 5;
        }else if(len <= 7){
            score += 10;
        }else{
            score += 25;
        }
        //字母、数字、符号统计
        boolean flag_a = false,flag_A = false;
        boolean flag_num = false,flag_ch = false;
        int num = 0,ch_count = 0;
        for(int i = 0; i < len; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                flag_a = true;
            }else if(ch >= 'A' && ch <= 'Z'){
                flag_A = true;
            }else if(Character.isDigit(ch)){
                flag_num = true;
                num++;
            }else{
                flag_ch = true;
                ch_count++;
            }
        }
        //字母
        if(flag_a == true && flag_A == true){
            score += 20;
        }else if(flag_a == true && flag_A == false || flag_a == false && flag_A == true){
            score += 10;
        }
        //数字
        if(flag_num == true){
            if(num > 1){
                score += 20;
            }else{
                score += 10;
            }
        }
        //符号
        if(flag_ch == true){
            if(ch_count > 1){
                score += 25;
            }else{
                score += 10;
            }
        }
        //奖励
        if(flag_a  && flag_A  && flag_num && flag_ch){
            score += 5;
        }else if(flag_num && flag_ch && ((flag_a&&!flag_A)||(!flag_a&&flag_A))){
            score += 3;
        }else if(flag_num && ((flag_a&&!flag_A)||(!flag_a&&flag_A))){
            score += 2;
        }
        String ret = null;
        if(score>=90)
            ret = "VERY_SECURE";
        else if(score>=80)
            ret = "SECURE";
        else if(score>=70)
            ret = "VERY_STRONG";
        else if(score>=60)
            ret = "STRONG";
        else if(score>=50)
            ret = "AVERAGE";
        else if(score>=25)
            ret = "WEAK";
        else if(score>=0)
            ret = "VERY_WEAK";

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            String ret = GetScore(str);
            System.out.println(ret);
        }
    }
}
