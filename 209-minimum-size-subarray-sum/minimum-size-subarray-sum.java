class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            while(sum>=target) {
                res=Math.min(res,i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        if(res==Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return res;
        }
    }
}