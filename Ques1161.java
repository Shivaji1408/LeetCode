import java.util.LinkedList;
import java.util.Queue;

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
public class Ques1161 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        int answerLevel = 1;
        long maxSum = Long.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (levelSum > maxSum) {
                maxSum = levelSum;
                answerLevel = level;
            }
            level++;
        }
        return answerLevel;
    }
}
