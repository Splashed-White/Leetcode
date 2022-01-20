package OJ;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-20
 * Time: 14:41
 */
public class 快乐数 {
    //重复过程无限循环，所以每一次的数值存入set中，只要出现了重复的，就不是快乐数
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = helper(n);
        }
        if(n == 1) return true;
        return false;
    }
    public int helper(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10,2);
            n = n/10;
        }
        return sum;
    }
}
