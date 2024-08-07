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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
     

        while(!queue.isEmpty()){
            int size = queue.size();
            double currentSum =0;
            for(int i=0; i<size; i++){
                TreeNode poppedNode = queue.poll();
                currentSum = currentSum + poppedNode.val;
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                }

                if(poppedNode.right != null) {
                    queue.add(poppedNode.right);
                }  
            }
            double currentValue = (double)currentSum/ size;
            list.add(currentValue);
            
        }

        return list;
    }
}