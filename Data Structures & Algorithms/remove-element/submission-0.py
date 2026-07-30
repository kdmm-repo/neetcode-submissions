class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        for poz, item in enumerate(nums):
            if item == val:
                nums[poz] = 0
            else: k += 1

        nums.sort(reverse=True)
        return k


        