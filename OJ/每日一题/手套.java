package OJ.每日一题;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-10
 * Time: 10:25
 */
public class 手套 {
    public int findMinimum(int n, int[] left, int[] right) {
        int len = left.length;
        int sum = 0;
        int sumLeft = 0,sumRight = 0;
        int minLeft = Integer.MAX_VALUE,minRight = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            if(left[i] * right[i] == 0){
                sum += left[i] + right[i];
            }else{
                sumLeft += left[i];
                sumRight += right[i];
                minLeft = Math.min(left[i],minLeft);
                minRight = Math.min(right[i],minRight);
            }
        }//for
        return Math.min(sumLeft-minLeft+1,sumRight-minRight+1) + sum + 1;
    }
}
