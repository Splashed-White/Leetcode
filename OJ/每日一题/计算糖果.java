package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-21
 * Time: 2:09
 */
public class 计算糖果 {
    //注意取值为整数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for(int i = 0; i < 4; i++){
            nums[i] = scanner.nextInt();
        }
        int a = 0,b = 0,c = 0;
        a = ((nums[0] + nums[2])/2);
        b = ((nums[2] - nums[0])/2);
        c = ((nums[3] - nums[1])/2);
        //最后带入原条件验证一下 筛选掉非整数的情况
        if(a-b==nums[0] && b-c==nums[1] && a+b==nums[2] && b+c==nums[3]){
            System.out.println(a + " " + b + " " + c);
        }else{
            System.out.println("No");
        }
    }
}
