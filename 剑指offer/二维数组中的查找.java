package 剑指offer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-12-29
 * Time: 16:22
 */
public class 二维数组中的查找 {
    /*
    target每次与右上角的元素比较，如果比目标值大就排除该列，如果比目标值小就排除该行
    */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(target < matrix[i][j]){
                j--;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
