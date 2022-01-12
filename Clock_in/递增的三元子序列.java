package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-12
 * Time: 21:55
 */


/**
 * 贪心算法 非连续的递增子序列，不用滑动窗口
 */
public class 递增的三元子序列 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= first){
                first = nums[i];
            }else if(nums[i] <= second){
                second = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}
