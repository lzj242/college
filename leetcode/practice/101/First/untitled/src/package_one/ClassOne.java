package package_one;

/*
  @Author : 墨宣
 * @Time : 2022/6/19 19:49
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


    TreeNode(int val) {
        this.val = val;
    }

}

/**
 * @author feng
 */
public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(classOne.isSymmetric(classOne.createNode(nums, 0)));
        scanner.close();
    }

    public TreeNode createNode(int[] arr, int index) {
        TreeNode treeNode = null;
        if (index < arr.length) {
            treeNode = new TreeNode(arr[index]);
            treeNode.left = createNode(arr, 2 * index + 1);
            treeNode.right = createNode(arr, 2 * index + 2);
        }
        return treeNode;
    }

    public boolean isSymmetric(TreeNode root) {
        return resolve(root, root);
    }

    public boolean resolve(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && resolve(p.right, q.left) && resolve(p.left, q.right);
    }
}
