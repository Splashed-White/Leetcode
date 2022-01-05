package BinaryTree;

import Node.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-08-22
 * Time: 23:40
 */
public class 二叉树的镜像 {
    public TreeNode inorder(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;
        if(root.left != null && root.right == null){
            root.right = inorder(root.left);
            root.left = null;
        }else if(root.left == null && root.right != null){
            root.left = inorder(root.right);
            root.right =null;
        }
        if(root.left != null && root.right != null){
            TreeNode temp = root.left;
            root.left = inorder(root.right);
            root.right = inorder(temp);
        }
        return root;
    }
    public TreeNode mirrorTree(TreeNode root) {
        return inorder(root);
    }
}
