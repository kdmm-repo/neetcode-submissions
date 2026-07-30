class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] == val){
                k = k+1;
                for(int j=i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                
            }
        }
        return nums.length-k ;
    }
}