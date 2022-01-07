package 剑指offer;

import Node.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-05
 * Time: 12:18
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * 递归 指针
 */
//public class 重建二叉树 {
//    public TreeNode helper(int preStart,int instart,int inEnd,int[] preorder,int[] inorder){
//        if (preStart > preorder.length-1 || instart > inEnd){
//            return null;
//        }
//        int index = 0;
//        TreeNode root = new TreeNode(preorder[preStart]);
//        for(int i = instart; i < inEnd; i++){
//            if(inorder[i] == root.val){
//                index = i;
//                break;
//            }
//        }
//        root.left = helper(preStart+1,0,index-1,preorder,inorder);
//        root.right = helper(preStart + index - instart + 1,index+1,inEnd,preorder,inorder);
//        return root;
//    }
//    public TreeNode buildTree(int[] preorder, int[] inorder){
//        return helper(0,0,inorder.length-1,preorder,inorder);
//    }
//}

/**
 * 递归 list
 */
public class 重建二叉树 {
    public TreeNode helper(List<Integer> preorderList, List<Integer> inorderList ){
        if(inorderList.size() == 0){
            return null;
        }
       int rootVal = preorderList.remove(0);
       TreeNode root = new TreeNode(rootVal);
       int mid = inorderList.indexOf(rootVal);
       root.left = helper(preorderList,inorderList.subList(0,mid));
       root.right = helper(preorderList,inorderList.subList(mid+1,inorderList.size()));
       return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder){
        List<Integer> preorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preorderList.add(preorder[i]);
            inorderList.add(inorder[i]);
        }
        return helper(preorderList,inorderList);
    }
}