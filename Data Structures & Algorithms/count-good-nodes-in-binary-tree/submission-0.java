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

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    private int dfs(TreeNode root, int maxsofar){
        if(root==null) {
            return 0;
        }
        int count =0;
//check if the current node is good
        if(root.val>=maxsofar){
            count =1;
        }
        //update the current node is good
        maxsofar=Math.max(maxsofar, root.val);

        count =count+dfs(root.left, maxsofar);
        count =count+dfs(root.right, maxsofar);
        return count;
    }
}
