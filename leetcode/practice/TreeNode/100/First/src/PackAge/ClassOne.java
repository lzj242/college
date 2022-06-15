package PackAge;

/**
 * @Author : 墨宣
 * @Time : 2022/6/13 21:16
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ClassOne {
    int count = 0;

    public static void main(String[] args) {
        ClassOne test1 = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] p = new int[scanner.nextInt()];
        for (int i = 0; i < p.length; i++) {
            p[i] = scanner.nextInt();
        }
        int[] q = new int[scanner.nextInt()];
        for (int i = 0; i < q.length; i++) {
            q[i] = scanner.nextInt();
        }
        test1.inOrder(test1.CreateNode(p));
        test1.inOrder(test1.CreateNode(q));
        System.out.println(test1.resolve(test1.CreateNode(p), test1.CreateNode(q)));
        scanner.close();
    }

    public TreeNode CreateNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode();
        if (count < arr.length) {
            // 如果二叉树数据空值正确，此判断可以省略
            node.val = arr[count++];
            if (node.val == 0) {
                return null;
            } else {
                node.left = CreateNode(arr);
                node.right = CreateNode(arr);
            }
        }
        return node;
    }

    public boolean resolve(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            //如果比到此时这两个节点都为空，证明到此时是都相同的
            return true;
        } else if (p != null && q != null) {
            //比较这个值是否相等
            if (p.val != q.val) {
                return false;
            }
            //左边
            if (!resolve(p.left, q.left)) {
                return false;
            }
            //右边
            if (!resolve(p.right, q.right)) {
                return false;
            }
            return true;
        } else {//如果是一个为空一个不为空肯定两棵二叉树就是不同的
            return false;
        }
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val + " ");
        inOrder(root.right);
    }
}
