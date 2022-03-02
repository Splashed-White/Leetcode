package OJ.每日一题;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-02
 * Time: 10:03
 */
public class 另类加法 {
    /**
     * 异或运算 和 两数相加的结果相同（不含进位） A^B
     * 与运算 和 两数相加的进位相同 （A&B）<<1
     * 所以 A^B + （A&B）<<1 就是结果，直到进位为0结束
     * 可以递归/循环
     * @param A
     * @param B
     * @return
     */
    public int addAB(int A, int B) {
        while(B != 0){
            int xor = A^B;
            int and = (A&B)<<1;
            A = xor;
            B = and;
        }
        return A;
    }

//    public int addAB(int A, int B) {
//        if (B != 0) {
//            int xor = A ^ B;
//            int and = (A & B) << 1;
//            return addAB(xor, and);
//        }else{
//            return A;
//        }
//    }

}
