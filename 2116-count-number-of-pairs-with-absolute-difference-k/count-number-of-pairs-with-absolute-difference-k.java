class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            int j=n-1;
            while(i<j && Math.abs(nums[i]-nums[j])>=k) {
                if(Math.abs(nums[i]-nums[j])==k) {
                    count+=1;
                }
                j--;
            }
        }
        return count;
    }
}