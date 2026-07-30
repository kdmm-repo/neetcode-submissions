class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_len, cont_len = 0, 0
        for item in nums:
            if item == 1:
                cont_len += 1
            else:
                max_len = max(max_len, cont_len)
                cont_len = 0
        max_len = max(max_len, cont_len)
        return max_len
