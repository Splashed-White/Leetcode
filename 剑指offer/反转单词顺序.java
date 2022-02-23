package 剑指offer;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-23
 * Time: 21:14
 */
public class 反转单词顺序 {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        //System.out.println(Arrays.toString(arr));
        StringBuffer ret = new StringBuffer();
        for(int i = arr.length-1; i >= 0; i--){
            if (!arr[i].equals(""))
                ret.append(arr[i]).append(" ");
        }
        return ret.toString().trim();
        //trim()方法:删除首位空格
    }
        public static void main(String[] args) {
            String str = "a good   example";
            String ret = reverseWords(str);
            System.out.println(ret);
        }
}
