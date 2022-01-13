package 剑指offer;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-29
 * Time: 16:11
 */
public class 替换空格 {
    public static String replaceSpace(String s) {
        if(s.length() == 0) return "";
        StringBuilder ret = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch == ' '){
                ret.append('%');
                ret.append('2');
                ret.append('0');
            }else{
                ret.append(ch);
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String s = "We .";
        String ret = replaceSpace(s);
        System.out.println(ret);
    }
}
