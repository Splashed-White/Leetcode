package Node;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2021-07-25
 * Time: 10:53
 */
public class TreeUtil {
    static int index;
    static String[] values;

    public TreeUtil(){}

    // 根据形如”1，2，#，4，5，#，7，#“的字符串建立二叉树，其中#代表该节点为空
    public void setValues(String treeValues) {
        values = treeValues.split(",");
        index = 0;

    }

    // 递归建立二叉树
    public static TreeNode createTree() {
        TreeNode node = null;
        if(index < values.length){
            if (values[index].equals("#")) {
                index++;
                return null;
            }
            node = new TreeNode(Integer.parseInt(values[index]));
            index++;
            node.left = createTree();
            node.right = createTree();
        }
        return node;
    }

    //前序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    //后序遍历
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
}
