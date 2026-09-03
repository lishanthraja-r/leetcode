// Last updated: 9/3/2026, 9:33:55 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        if (nums.length == 1) {
4            return;
5        }
6
7        int nonZeroIndex = 0;
8
9        for (int i = 0; i < nums.length; i++) {
10            if (nums[i] != 0) {
11                nums[nonZeroIndex] = nums[i];
12                nonZeroIndex++;
13            }
14        }
15
16       
17         while(nonZeroIndex<nums.length){
18            nums[nonZeroIndex] = 0;
19            nonZeroIndex++;
20        }
21    }
22}