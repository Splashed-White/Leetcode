package OJ;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-12
 * Time: 20:26
 */
public class 回文字符串 {
    public static String Reverse(char[] array){
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            char temp = array[right];
            array[right] = array[left];
            array[left] = temp;
            left++;
            right--;
        }
        return new String(array);
    }
    public static boolean judge (String str) {
        if(str.length() == 0) return true;
        char[] array = str.toCharArray();
        String ret = Reverse(array);
        if(str.equals(ret)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "aaba";
        boolean ret = judge(str);
        System.out.println(ret);
    }
}
