package OJ.每日一题;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-03
 * Time: 20:23
 */

/**
 * 满二叉树中，父节点 = 子节点 / 2;
 * 每个取最大的数/2,直到a == b,模拟不断向上查找父节点的过程
 */
public class 最近公共祖先 {
    public int getLCA(int a, int b) {
        while(a != b){
            if(a > b){
                a /= 2;
            }else{
                b /= 2;
            }
        }//while
        return a;
    }
}
