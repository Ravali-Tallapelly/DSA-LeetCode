class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count=1
        idx=1
        n=len(nums)
        for i in range(1,n):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if(count<=2):
                nums[idx]=nums[i]
                idx+=1
        return idx