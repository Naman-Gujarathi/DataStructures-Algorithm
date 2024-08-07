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
class BSTIterator {
    Stack<TreeNode> stack;
    TreeNode curr = null;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
         curr = root;
         pushAll(curr);
         
    }

    
   
    
    public int next() {
        TreeNode poppedValue = stack.pop();
        if(poppedValue.right != null){
            curr = poppedValue.right;
            pushAll(curr);
           
        }
        return poppedValue.val;
        
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void pushAll(TreeNode curr){
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */