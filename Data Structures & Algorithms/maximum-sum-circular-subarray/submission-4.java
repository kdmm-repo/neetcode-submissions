class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int n= nums.length; 

        for( int i = 0  ; i < n ; i++ ) {
            int currsum = 0;
            int k = i;
            for( int j = 0  ; j < n ; j++ ){
                currsum = currsum < 0 ? nums[k] : currsum+ nums[k];
                 maxsum = Math.max(currsum, maxsum);
                 k = k==n-1 ? 0 : k+1 ;  
            }
        }    
        
        return maxsum;
    }
}