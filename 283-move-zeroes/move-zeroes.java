class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[k++]=nums[i];
            }
            else {
                count++;
            }
        }
        for(int i=n-count;i<n;i++) {
            nums[i]=0;
        }
    }
}