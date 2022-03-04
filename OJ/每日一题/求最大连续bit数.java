package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-03
 * Time: 20:35
 */
public class 求最大连续bit数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int count = 0;
            int max = 0;
            int n = scanner.nextInt();
            while(n != 0){
                if((n & 1) == 1){
                    count++;
                    max = Math.max(max,count);
                }else{
                    count = 0;
                }
                n = n>>1;
            }
            System.out.println(max);
        }
    }
}