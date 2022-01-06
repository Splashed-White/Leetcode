package Clock_in;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-18
 * Time: 15:46
 */

/**
 * 两个map遍历：本地所有测试用例都没有问题，但是OJ上答案报错？
 * 且代码太繁琐
 */
//public class 统计出现过一次的公共字符串 {
//    public static int countWords(String[] words1, String[] words2) {
//        Map<String,Integer> map1 = new HashMap<>();
//        Map<String,Integer> map2 = new HashMap<>();
//        int count = 0;
//        //分别统计两个字符串数组的各字符串个数于map1与map2中
//        for(int i = 0; i < words1.length; i++){
//            String str = words1[i];
//            if(!map1.containsKey(str)){
//                map1.put(str,1);
//            }else{
//                int value = map1.get(str);
//                map1.put(str,++value);
//            }
//        }//for
//        System.out.println(map1);
//        for(int i = 0; i < words2.length; i++){
//            String str = words2[i];
//            if(!map2.containsKey(str)){
//                map2.put(str,1);
//            }else{
//                int value = map2.get(str);
//                map2.put(str,++value);
//            }
//        }//for
//        System.out.println(map2);
//        //遍历两个map，如果存在对应key且value==1则count++
//        for (Map.Entry<String,Integer> entry1:map1.entrySet()) {
//            for (Map.Entry<String,Integer> entry2:map2.entrySet()){
//                if(entry1.getKey() ==  entry2.getKey() && entry1.getValue() == entry2.getValue() && entry1.getValue() == 1){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
////        String[] words1 = {"leetcode","is","amazing","as","is"};
////        String[] words2 = {"amazing","leetcode","is"};
//        String[] words1 = {"a","ab"};
//        String[] words2 = {"a","a","a","ab"};
//        int ret = countWords(words1,words2);
//        System.out.println(ret);
//    }
//}


public class 统计出现过一次的公共字符串 {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        int count = 0;
        //分别统计两个字符串数组的各字符串个数于map1与map2中
        for (String s:words1) {
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for (String s:words2) {
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        //遍历两个map,如果map中存在该key 且 map1和map2的value都为1，则count++
        for (String s:map1.keySet()) {
            if(map1.get(s) == 1 && map2.get(s) == 1 && map2.containsKey(s)){
                count++;
            }
        }
        return count;
    }
}
