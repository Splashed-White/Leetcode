package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-06
 * Time: 15:10
 */
public class 查找组成一个偶数最接近的两个素数 {
    public static boolean judge(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
//        if (i >=n) {
//            System.out.println(number + "是素数");
//        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scanner.nextInt();
            int[] ret = new int[2];
            int value = 0;
            int min = n - 2;
            for (int i = 1; i <= n/2; i++) {
                if (judge(i) && judge(n - i)) {
                    ret[0] = i;
                    ret[1] = n - i;
                }
            }//for
            System.out.println(ret[0]);
            System.out.println(ret[1]);
        }
    }
}