package OJ.每日一题;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-06
 * Time: 14:27
 */
public class 二进制插入 {
    //m左移i位 和n相与
    public int binInsert(int n, int m, int j, int i) {
        m = (m << j);
        return n | m;
    }
}
