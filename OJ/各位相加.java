package OJ;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-20
 * Time: 14:42
 */
public class 各位相加 {
    public int helper(int num){
        int ret = 0;
        while(num > 0){
            ret += num % 10;
            num = num/10;
        }
        return ret;
    }
    public int addDigits(int num) {
        if(num == 0) return 0;
        while(num/10 != 0){
            num = helper(num);
        }
        return num;
    }
}
