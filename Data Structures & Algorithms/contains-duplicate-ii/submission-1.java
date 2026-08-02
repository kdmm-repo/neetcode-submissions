class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length ;
        for(int i=0; i < n ; i++ ){
            
            for(int j = Math.min(i+k, n-1) ; j > i; j--){
               if( nums[j] == nums[i] && Math.abs(i-j) <=k) return true;
            }
        }

        return false;
    }
}