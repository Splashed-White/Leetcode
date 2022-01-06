package Clock_in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-05
 * Time: 11:25
 */
public class 替换所有的问号 {
    public static String modifyString(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '?') {
                for (int j = 0; j < 26; j++) {
                    char ch = (char) ('a' + j);
                    // 不等于左右字符，注意边界的处理
                    if ((i == 0 || ch != array[i - 1]) && (i == array.length - 1 || ch != array[i + 1])) {
                        array[i] = ch;
                        break;
                    }
                }
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        String s = "j?qg??b";
        String ret = modifyString(s);
        System.out.println(ret);
    }
}
