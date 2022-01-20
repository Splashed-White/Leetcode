package OJ.每日一题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-20
 * Time: 15:49
 */
public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i],value+1);
            }else{
                map.put(array[i],1);
            }
        }//for
        //遍历map找到对应value>len/2的数值
        // 获取键集合的迭代器
        int key = 0,value = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            key = (int) it.next();
            value = (int) map.get(key);
            if(value > array.length/2)
                return key;
        }
        return -1;
    }
}
