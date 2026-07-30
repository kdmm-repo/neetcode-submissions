class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,currentRun=0;
        for(int i=0;i<nums.length;i++){
            currentRun = nums[i]==1 ? currentRun+1 : 0;  
            max = currentRun > max ? currentRun : max; 
            }
        return max; 
    }
        
}
