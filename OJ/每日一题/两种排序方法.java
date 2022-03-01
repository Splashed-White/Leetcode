package OJ.每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-01
 * Time: 14:44
 */
public class 两种排序方法 {
    public static boolean Dic(String[] arr){
        /**
         * 注意数组的深浅拷贝
         */
//        String[] temp = arr;
        String[] temp = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);  //实现对数组按字典顺序排序
        if (Arrays.equals(arr, temp)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean Lengths(String[] arr){
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
             temp[i] = arr[i].length();
        }
        for(int i = 0; i < temp.length-1; i++){
            if(temp[i+1] < temp[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //字符串长度
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.next();
        }
        boolean ret1 = Lengths(arr);
        boolean ret2 = Dic(arr);
        if(ret1 == true && ret2 == true){
            System.out.println("both");
        }else if(ret1 == true && ret2 == false){
            System.out.println("lengths");
        }else if(ret1 == false && ret2 == true){
            System.out.println("lexicographically");
        }else{
            System.out.println("none");
        }
    }
}
