// Last updated: 7/17/2026, 3:08:47 PM

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        fun(root, result);
        return result;
    }
    public static void fun(TreeNode root, List<Integer> result){
        if(root != null){
            fun(root.left, result);
            fun(root.right, result);
            result.add(root.val);
        }
    }
}