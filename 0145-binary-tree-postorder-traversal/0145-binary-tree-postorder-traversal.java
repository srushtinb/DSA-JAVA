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
    LinkedList<Integer>list=new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root!=null){
       postorderTraversal(root.left);
       postorderTraversal(root.right);
        list.add(root.val);
        }
        return list;
    }
}