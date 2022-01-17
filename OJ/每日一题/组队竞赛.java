package OJ.每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-17
 * Time: 23:16
 */
public class 组队竞赛 {
    //法一：
    /*public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//n个队伍
        int[] array = new int[3*n];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        //每次删除首尾，取当前的尾累加并删除
        int i = 0,j = array.length-1;
        while(n > 0){
            i++;
            j--;
            sum += array[j];
            j--;
            n--;
        }
        System.out.println(sum);
    }*/
    //法二：
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//n个队伍
        int[] array = new int[3*n];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        //每次选数组中第二大的，还要除开最大的
        int k = 1;
        int len = array.length;
        while(n > 0){
            sum += (long)array[len-(2*k)]; //按下标规律取数值
            k++;
            n--;
        }
        System.out.println(sum);
    }
}
