class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currsum = 0;
        for(int i : nums) {
            currsum = currsum < 0 ? i : currsum+i;
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }
}
