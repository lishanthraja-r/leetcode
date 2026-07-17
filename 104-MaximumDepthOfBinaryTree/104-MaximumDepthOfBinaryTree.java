// Last updated: 7/17/2026, 3:09:03 PM

class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode node){
        if(node==null)return 0;
        int left=helper(node.left);
        int right=helper(node.right);
        return Math.max(left,right)+1;
    }
}