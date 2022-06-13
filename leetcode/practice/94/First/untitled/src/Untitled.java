import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author : 墨宣
 * @Time : 2022/6/9 21:15
 * @File : Untitled
 * 任务 :
 */

class TreeNode {
    public char val;
    public TreeNode leftNode;
    public TreeNode rightNode;

    TreeNode(char val) {
        this.val = val;
    }

    TreeNode() {
    }

    ;
}





public class Untitled {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>() {
        };
        Untitled Untitled = new Untitled();
        Untitled.creatTreeNode();
        Untitled.preOrder(Untitled.creatTreeNode());
        System.out.println();
        Untitled.inOrder(Untitled.creatTreeNode());
        System.out.println();
        list = Untitled.inorderTraversal(Untitled.creatTreeNode());
        for (Character character : list) {
            System.out.print(character + " ");
        }
        System.out.println();
        List<Character> list1 = new ArrayList<Character>() {
        };
        list1 = Untitled.inorderTraversalpList(Untitled.creatTreeNode());
        for (Character character : list1) {
            System.out.println(character + " ");
        }
    }

    public TreeNode creatTreeNode() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.leftNode = B;
        A.rightNode = C;
        B.leftNode = D;
        B.rightNode = E;
        E.rightNode = H;
        C.leftNode = F;
        C.rightNode = G;
        return A;
    }

    void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val + " ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.leftNode);
        System.out.println(root.val + " ");
        inOrder(root.rightNode);
    }

    public List<Character> inorderTraversal(TreeNode root) {
        List<Character> inOrder = new ArrayList<Character>();
        resolve(root, inOrder);
        return inOrder;
    }

    void resolve(TreeNode root, List inOrder) {
        if (root == null) {
            return;
        }
        resolve(root.leftNode, inOrder);
        inOrder.add(root.val);
        resolve(root.rightNode, inOrder);
    }

    public List<Character> inorderTraversalpList(TreeNode root) {
        List<Character> inOrder = new ArrayList<Character>();
        resolve1(root, inOrder);
        return inOrder;
    }

    void resolve1(TreeNode root, List inOrder) {
        if (root == null) {
            return;
        } else {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode p = root;
            while (!stack.isEmpty() || p != null) {
                if (p != null) {
                    stack.push(p);
                    p = p.leftNode;
                } else {
                    p = stack.pop();
                    inOrder.add(p.val);
                    p = p.rightNode;
                }
            }
        }
    }
}

