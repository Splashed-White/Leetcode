package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-28
 * Time: 9:35
 */
public class Fibonacci数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0,f2 = 1;
        int f3 = 0;
        int left = 0,right = 0;
        int ret = 0;
        while(true){
            f3 = f1 + f2;
            if(f3 < n){
                left = f3;
            }else{
                right = f3;
                break;
            }
        }//while
        ret = Math.min((n-left),(right - n));
        System.out.println(ret);
    }
}