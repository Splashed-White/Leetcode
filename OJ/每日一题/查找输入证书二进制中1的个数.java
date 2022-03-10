package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-10
 * Time: 10:24
 */
public class 查找输入证书二进制中1的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scanner.nextInt();
            int count = 0;
            while (n != 0) {
                if ((n & 1) == 1) {
                    count++;
                }
                n = n >> 1;
            }
            System.out.println(count);
        }
    }
}
