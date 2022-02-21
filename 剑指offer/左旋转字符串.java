package 剑指offer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-21
 * Time: 15:52
 */
public class 左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,len);
        StringBuffer ret = new StringBuffer();
        ret.append(s2);
        ret.append(s1);
        return ret.toString();
    }
}
