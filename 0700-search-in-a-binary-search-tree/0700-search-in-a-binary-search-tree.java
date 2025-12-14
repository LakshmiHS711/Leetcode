/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Start from the root
        TreeNode current = root;

        // Traverse until the current node is null (end of a branch)
        // or the value is found.
        while (current != null) {
            if (val == current.val) {
                // Key found! Return the current node (the root of the matching subtree).
                return current;
            } else if (val < current.val) {
                // The value must be in the left subtree, so move left.
                current = current.left;
            } else { // val > current.val
                // The value must be in the right subtree, so move right.
                current = current.right;
            }
        }

        // If the loop finishes without finding the value, return null.
        return null;
    }
}