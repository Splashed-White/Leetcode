package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-10
 * Time: 11:04
 */
public class 完全数计算 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if( n < 6){
            System.out.println(0);
        }
        int count = 0;
        for(int i = 6; i <= n; i++){
            int sum = 0;
            for(int j = 1 ; j < i; j++){
                if(i%j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
