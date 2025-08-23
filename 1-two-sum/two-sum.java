class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++) {
            int j=i+1;
            while(j<nums.length && nums[i]+nums[j]!=target) {
                j++;
            }
            if(j<nums.length && nums[i]+nums[j]==target) {
                res[0]=i;
                res[1]=j;
                break;
            }
        }
        return res;
    }
}