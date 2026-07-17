// Last updated: 7/17/2026, 3:07:06 PM

class Solution {
    public void inorder(TreeNode root, ArrayList<Integer>list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum  = 0;
        ArrayList<Integer>list =  new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=low && list.get(i)<=high){
                sum+=list.get(i);
            }
        }
        return sum;
    }
}