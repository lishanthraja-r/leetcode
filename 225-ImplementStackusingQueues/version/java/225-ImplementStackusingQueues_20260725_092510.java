// Last updated: 7/25/2026, 9:25:10 AM
1class Solution {
2    private void paths(TreeNode root, List<String> result, StringBuilder sb) {
3        if (root == null) return;
4        int len = sb.length();
5        sb.append(root.val);
6        if (root.left == null && root.right == null) {
7            result.add(sb.toString());
8        } else {
9            sb.append("->");
10        }
11        paths(root.left,  result, sb);
12        paths(root.right, result, sb);
13        sb.setLength(len);
14    }
15
16    public List<String> binaryTreePaths(TreeNode root) {
17        List<String> result = new ArrayList<>();
18        if (root == null) return result;
19        paths(root, result, new StringBuilder());
20        return result;
21    }
22}