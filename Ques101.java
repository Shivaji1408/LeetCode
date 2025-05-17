// Ques : 101 Symmetric Tree
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

// Example 1:
// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Example 2:
// Input: root = [1,2,2,null,3,null,3]
// Output: false
 
// Constraints:
// The number of nodes in the tree is in the range [1, 1000].
// -100 <= Node.val <= 100

// Code :


public class Ques101 {
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }
    public boolean symmetric(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        boolean left = symmetric(r1.left, r2.right);
        boolean right = symmetric(r1.right, r2.left);
        return left && right;
    }
    public static void main(String args[]){
        
    }
}