// Last updated: 7/17/2026, 3:08:49 PM

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        preorder(root , res);
        return res;
        
    }
    private void preorder(TreeNode node , List<Integer> res){
        if(node == null){
            return;
        }
        res.add(node.val);
        preorder(node.left , res);
        preorder(node.right , res);
    }
}