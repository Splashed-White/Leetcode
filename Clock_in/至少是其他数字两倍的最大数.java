package Clock_in;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-13
 * Time: 1:02
 */
public class 至少是其他数字两倍的最大数 {
    public static int dominantIndex(int[] nums) {
        //找到最大值及下标
        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
                max = nums[i];
                index = i;
            }
        }
        //new新数组存放两倍值，除了max
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != max){
                array[i] = nums[i]*2;
            }else{
                array[i] = max;
            }
        }
        //遍历array，判断是否所有值都 <= max
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ret = dominantIndex(nums);
        System.out.println(ret);
    }
}
