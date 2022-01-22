package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-21
 * Time: 2:29
 */
public class 进制转换 {
    public static void main(String[] args) {
        //需要考虑 M < 0 的情况
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        boolean flag = false;
        if(M < 0){
            flag = true;
            M = -M;
        }
        String str = "0123456789ABCDEF";
        StringBuffer ret = new StringBuffer();
        while(M > 0){
            ret.append(str.charAt(M % N));
            M = M / N;
        }
        if(flag == true){
            ret.append("-");
        }
        ret.reverse().toString();
        System.out.println(ret);
    }
}
