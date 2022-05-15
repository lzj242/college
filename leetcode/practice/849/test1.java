public class test{
    public static void main(String[] args) {
        
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
}
void traverse(TreeNode root){
    traverse(root.left);
    traverse(root.right);
}