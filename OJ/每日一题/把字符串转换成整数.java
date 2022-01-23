package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-22
 * Time: 16:09
 */
public class 把字符串转换成整数 {
    public int StrToInt(String str) {
        if(str.length() == 0) return 0;
        int ret = 0;
        int i = (str.charAt(0) == '+' || str.charAt(0) == '-')? 1 : 0;
        boolean flag = str.charAt(0) == '-' ? true:false;  //flag == true 表示负数
        for(;i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                ret = ret * 10 + ch - '0';
            }else{
                return 0;
            }
        }//for
        if(flag == true){
            ret = - ret;
        }
        return ret;
    }
}
