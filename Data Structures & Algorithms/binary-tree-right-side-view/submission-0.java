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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans= new ArrayList<>();  //ans in out put 
        if(root==null){     //base case
            return ans;
        }
        Queue<TreeNode>q= new LinkedList<>();   // queue to check the elemnet or compare it 
        q.offer(root); // add the frist nood int queue

        while(!q.isEmpty()){
            int size= q.size();  //it tell how many nodes are in crrent level

            for(int i=0; i<size; i++){
                TreeNode node= q.poll();

                if(i==size-1){
                    ans.add(node.val);
                }

                if(node.left !=null)q.offer(node.left);
                if(node.right!= null)q.offer(node.right);
            }
        }
        return ans;
    }
}
