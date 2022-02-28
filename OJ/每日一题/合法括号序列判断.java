package OJ.每日一题;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-02-28
 * Time: 10:21
 */
public class 合法括号序列判断 {
    public static boolean chkParenthesis(String A, int n) {
        if(n % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = A.charAt(i);
            if(stack.isEmpty() && ch == ')'){
                return false;
            }
            if(ch != '(' && ch != ')'){
                return false;
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                stack.pop();
            }
        }//for
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String A = "()))))()(d";
        boolean flag = chkParenthesis(A,10);
        System.out.println(flag);
    }
}
