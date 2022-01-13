package Clock_in;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-14
 * Time: 0:20
 */

/**
 * 优先队列 构建大小为 K 的大根堆
 */
public class 查找和最小的K对数字 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        //PriorityQueue默认情况下是小根堆 使用lambda表达式修改
        Queue<int[] > queue = new PriorityQueue<>((x, y)->y[0] - x[0]);
        for(int i = 0; i < nums1.length && i < k; i++){
            for(int j = 0; j < nums2.length && j < k; j++){
                if(queue.size() < k){
                    int[] temp = new int[3];
                    temp[0] = nums1[i] + nums2[j];
                    temp[1] = i; //存储下标
                    temp[2] = j;
                    queue.offer(temp);
                }else if((nums1[i] + nums2[j]) < queue.peek()[0]){
                    //更新大根堆
                    queue.poll();
                    int[] temp = new int[3];
                    temp[0] = nums1[i] + nums2[j];
                    temp[1] = i;
                    temp[2] = j;
                    queue.offer(temp);
                }
            }//forj
        }//fori
        //遍历大根堆
        for (int[] array:queue) {
            List<Integer> list = new ArrayList<>();
            list.add(nums1[array[1]]);
            list.add(nums2[array[2]]);
            ret.add(list);
        }
        return ret;
    }

}
