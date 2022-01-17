package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-17
 * Time: 22:40
 */
public class 排序子序列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n + 1];
        int count = 0;
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        array[n] = 0;
        //遍历数组，分别判断递增或递减
        for(int i = 0; i < n; i++){
            //连续递增
            if(array[i] < array[i + 1]){
                while(i < n && array[i] < array[i+ 1]){
                    i++;
                }
                count++;
            }else if(array[i] > array[i + 1]){ //连续递减
                while(i < n && array[i] > array[i + 1]){
                    i++;
                }
                count++;
            }else{   //连续相同 array[i] = array[i+1]
                i++;
            }
        }//for
        System.out.println(count);
    }
}
