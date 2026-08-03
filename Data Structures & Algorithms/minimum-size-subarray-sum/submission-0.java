class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = 10001 , n=nums.length;

        for(int i=0; i< n; i++){
            if(nums[i] >= target) return 1; // if any element is greater than target return 1
            int sum = nums[i];
            for(int j=i+1 ; j< Math.min(n,i+minLen); j++){ 
                sum += nums[j];
                if(sum >= target) minLen = j-i+1; 
            }
        }

        return minLen == 10001 ? 0 : minLen;
    }
}