package OJ;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-14
 * Time: 1:31
 */
public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
