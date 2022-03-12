package OJ.每日一题;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-11
 * Time: 9:57
 */
public class 杨辉三角变形 {
    public static int getNum(int n){
        if(n == 1 || n == 2) return -1;
        if(n%2 == 1) return 2;
        if(n%4 == 0) return 3;
        return 4;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scanner.nextInt();
            System.out.println(getNum(n));
        }
    }
}
