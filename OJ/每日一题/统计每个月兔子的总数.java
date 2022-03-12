package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-11
 * Time: 21:15
 */

/**
 *               1月龄兔子     2月龄兔子    成年兔子    兔子总数
        第1月        1            0          0         1
        第2月        0            1          0         1
        第3月        1            0          1         2
        第4月        1            1          1         3
        第5月        1            1          2         5

        递归公式：F(n) = F(n-1) + F(n-2);
 */
public class 统计每个月兔子的总数 {
    public static int Fun(int n){
        if(n == 1 || n == 2) return 1;
        return Fun(n-1) + Fun(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scanner.nextInt();
            System.out.println(Fun(n));
        }
    }
}
