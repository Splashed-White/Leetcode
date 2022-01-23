package PAT;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-23
 * Time: 21:22
 */

/**
 * 1.惯性思维将 n==1作为了特殊条件，实际上1也是进行循环判断；
 */
public class Callatz猜想 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        if(n <= 1000){
            while(n != 1){
                if(n % 2 == 0){
                    //偶数
                    n /= 2;
                    count++;
                }else{
                    //奇数
                    n = (3*n+1)/2;
                    count++;
                }
            }//while
        }
        System.out.println(count);
    }
}
