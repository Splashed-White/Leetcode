package String;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-09-27
 * Time: 9:13
 */
public class Excel表列名称 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                sb.append((char)'Z');
                n = n / 26 - 1;
            } else {
                sb.append((char)('A' + n % 26 - 1));
                n /= 26;
            }
        }
        return sb.reverse().toString();
    }
}
