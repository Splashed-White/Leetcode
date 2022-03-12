package OJ.每日一题;

import Node.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-03-11
 * Time: 10:31
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null){
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        Mirror(root.left);
        Mirror(root.right);
    }
}
