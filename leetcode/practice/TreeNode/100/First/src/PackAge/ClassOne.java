
/*
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
        System.out.println(test1.resolve(test1.CreateNode(p,0), test1.CreateNode(q,0)));
        scanner.close();
    }

    public TreeNode CreateNode(int[] arr,int index) {
        TreeNode treeNode = null;
        if (index < arr.length) {
            treeNode = new TreeNode(arr[index]);
            // 对于顺序存储的完全二叉树，如果某个节点的索引为index，其对应的左子树的索引为2*index+1，右子树为2*index+1
            treeNode.left = CreateNode(arr, 2 * index + 1);
            treeNode.right = CreateNode(arr, 2 * index + 2);
        }
        return treeNode;
    }

    public boolean resolve(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            // 如果比到此时这两个节点都为空，证明到此时是都相同的
            return true;
        } else if (p != null && q != null) {
            // 比较这个值是否相等
            if (p.val != q.val) {
                return false;
            }
            // 左边
            if (!resolve(p.left, q.left)) {
                return false;
            }
            // 右边
            if (!resolve(p.right, q.right)) {
                return false;
            }
            return true;
        } else {// 如果是一个为空一个不为空肯定两棵二叉树就是不同的
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
