// Last updated: 7/17/2026, 3:09:05 PM

class Solution {
    public boolean isSymmetric(TreeNode root) {
        //mirror is the boolean function which return true or false based on the node same or not. Defined below
        return mirror(root.left,root.right);
    }

    //mirror is the recursive boolean function for check the tree until the depth(leaf node)
    public boolean mirror(TreeNode left, TreeNode right) {
        //This is the base condition. it return true if we find the last node.
        //only we get true if both node is null else it skips
        if (left == null && right == null)
            return true;

        //this is the second condition which checks if there is any one node is null or not if yes we return false because we need same symmetric tree.
        if (left == null || right == null)
            return false;

        //final check condition is its values. we check the both values are not equal or not. if the both values are not equal we return false. because we need same values for semmetric tree (adjacent sides)
        if (left.val != right.val)
            return false;

        //its recursive statement which return true. if the both function are true using and keyword.
        //why? we using two functions -> as per the condition we need to check both left and right nodes expect root node.
        // but the inputs in the left and right nodes values provided in the adjacent side(opposite) side
        //so we pass both left and right nodes into the mirror function
        return mirror(left.left,right.right) && mirror(left.right, right.left);
    }
}