// Last updated: 7/17/2026, 3:08:39 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort( nums ) ;
        int count = 0 ;
        int max = Integer.MIN_VALUE ;
        int sum = 0 ;

        for( int i = 0 ; i < nums.length ; i ++ ){
            count++ ;
        }
        if( count < 2 ) return 0 ;

        for( int i = 1 ; i < nums.length ; i ++ ){
            sum = ( nums[i] - nums[ i - 1 ]) ;
            max = Math.max ( sum , max ) ;
        }
        return max ;
    }
}