package OJ;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-20
 * Time: 14:42
 */
public class 丑数 {
    //递归
    public boolean isUgly(int n) {
        if(n <= 0 ) return false;//0和负数一定不是丑数
        return helper(n);
    }
    public boolean helper(int n){
        if(n == 1 ) return true;
        if(n == 0) return false;
        int i2 = n % 2;
        int i3 = n % 3;
        int i5 = n % 5;
        if(i2 == 0){
            return helper(n/2);
        }else if(i3 == 0){
            return helper(n/3);
        }else if(i5 == 0){
            return helper(n/5);
        }else{
            return false;
        }
    }
}
