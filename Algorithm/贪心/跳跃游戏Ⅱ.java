package Algorithm.贪心;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-11-18
 * Time: 16:55
 */
public class 跳跃游戏Ⅱ {
    public static int jump(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0; //记录跳跃次数
        int maxDistance = 0; //记录当前位置的覆盖范围
        int distance = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance,i + nums[i]);
            //在当前位置，再跳一步就可以到达结尾
            if(maxDistance >= nums.length -1){
                count++;
                break;
            }
            //更新覆盖范围
            if(i == maxDistance){
                distance = maxDistance;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int ret = jump(nums);
        System.out.println(ret);
    }
}
