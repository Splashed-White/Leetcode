package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-20
 * Time: 15:15
 */

/**
 * 注意审题，连续最长的数字串，数字串不用有序递增，只要是连续数字就行
 */
public class 字符串中找出连续最长的字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0,max = 0,end = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                count++;
                if(max < count){
                    max = Math.max(max,count);
                    end = i;
                }
            }else{  //字母
                count = 0;
            }
        }//for
        //输出
        for(int i = end-max+1; i <= end;i++){
            System.out.print(str.charAt(i));
        }
    }
}
