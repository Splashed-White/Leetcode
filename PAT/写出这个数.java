package PAT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-23
 * Time: 21:51
 */
public class 写出这个数 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] index = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            sum += ch - '0';
        }
        String ret = sum + "";
        for(int i = 0; i < ret.length()-1; i++){
            char ch = ret.charAt(i);
            System.out.print(index[ch-'0'] + " ");
        }
        System.out.print(index[ret.charAt(ret.length()-1)-'0']);
    }
}
