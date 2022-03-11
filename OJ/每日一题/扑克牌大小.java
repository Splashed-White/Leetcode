package OJ.每日一题;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-10
 * Time: 11:04
 */
public class 扑克牌大小 {
    public static void Compare(String input){
        String[] arr = input.split("-");
        //只要有joker Joker 直接输出
        if(arr[0].contains("joker JOKER") || (arr[1].contains("joker JOKER"))){
            System.out.println("joker JOKER");
            return;
        }
        //除去对王的情况，只要其中任意一方长度为4，就说明是次大的炸弹，直接输出
        if(arr[0].split(" ").length == 4 && arr[1].split(" ").length != 4){
            System.out.println(arr[0]);
            return;
        }else if((arr[1].split(" ").length == 4 && arr[0].split(" ").length != 4)){
            System.out.println(arr[1]);
            return;
        }
        //长度相等，比较牌面大小
        if(arr[0].split(" ").length == arr[1].split(" ").length){
            String num1 = arr[0].split(" ")[0]; //玩家1牌面的第一张牌面
            String num2 = arr[1].split(" ")[0]; //玩家2牌面的第一张牌面
            int num1_index = 0,num2_index = 0; //牌面对应的index大小
            String[] index = {"3","4","5","6","7","8","9","10","J","Q","K",
                    "A","2","joker","JOKER"};
            for(int i = 0; i < index.length; i++){
                if(num1.equals(index[i])){
                    num1_index = i;
                }
                if(num2.equals(index[i])){
                    num2_index = i;
                }
            }//for
            if(num1_index > num2_index){
                System.out.println(arr[0]);
            }else if(num1_index < num2_index){
                System.out.println(arr[1]);
            }else {
                System.out.println("ERROR");
            }
        }else{
            System.out.println("ERROR");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String input = scanner.nextLine();
            Compare(input);
        }
        scanner.close();
    }
}

//
//
//package HUAWEI3;
//
//        import java.util.Scanner;
//
//public class Demo08 {
//    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String s = sc.nextLine();
//            compare(s);
//        }
//        sc.close();
//    }
//    public static void compare(String s){
//        String[] arr;
//        arr = s.split("-");
//        if(arr.length!=2){
//            System.out.println();
//            return;
//        }
//        if(arr[0].contains("joker JOKER")||arr[1].equals("joker JOKER")){//为啥必须用equals
//            System.out.println("joker JOKER");
//        }
//        else{
//            if(arr[0].split(" ").length==4&&arr[1].split(" ").length!=4){
//                System.out.println(arr[0]);
//                return;
//            }else if(arr[1].split(" ").length==4&&arr[0].split(" ").length!=4){
//                System.out.println(arr[1]);
//                return;
//            }
//            if(arr[0].split(" ").length==arr[1].split(" ").length){
//                String num1 = arr[0].split(" ")[0];
//                String num2 = arr[1].split(" ")[0];
//                int num1_flag = 0;
//                int num2_flag = 0;
//                String[] arr_biaozhun ={"3","4","5","6","7","8","9","10","J","Q","K","A","2","joker","JOKER"};
//                for(int i=0;i<arr_biaozhun.length;i++){
//                    if(num1.equals(arr_biaozhun[i])){
//                        num1_flag = i;
//                    }
//                    if(num2.equals(arr_biaozhun[i])){
//                        num2_flag = i;
//                    }
//                }
//                if(num1_flag>num2_flag){
//                    System.out.println(arr[0]);
//                    return;
//                }else if(num2_flag>num1_flag){
//                    System.out.println(arr[1]);
//                    return;
//                }else{
//                    System.out.println("ERROR");
//                    return;
//                }
//            }else{
//                System.out.println("ERROR");
//                return;
//            }
//
//        }
//    }
//}
//
