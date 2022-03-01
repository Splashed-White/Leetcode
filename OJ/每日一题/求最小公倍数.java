package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-01
 * Time: 15:19
 */
public class 求最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i = 1; i <= a*b; i++){
            if(i%a == 0 && i%b == 0){
                System.out.println(i);
            }
        }
    }
}
