package 剑指offer;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-24
 * Time: 17:28
 */
public class 打印从1到最大的n位数 {
    public static int[] printNumbers(int n) {
        int num = (int)Math.pow(10, n);
        int[] arr = new int[num-1];
        for(int i = 1; i< num; i++){
            arr[i-1] = i;
        }
        return arr;
    }
}
