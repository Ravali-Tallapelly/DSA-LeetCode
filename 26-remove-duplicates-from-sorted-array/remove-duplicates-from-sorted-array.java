class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=1;i<n;i++) {
            if(nums[i]==nums[i-1]) {
                continue;
            }
            else {
                nums[k]=nums[i-1];
                k++;
            }
        }
        nums[k]=nums[n-1];
        return k+1;
    }
}
