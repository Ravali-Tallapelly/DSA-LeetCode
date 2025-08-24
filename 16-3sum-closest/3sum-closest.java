class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int miniSum=Integer.MAX_VALUE;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            int j=i+1;
            int k=n-1;
            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>target) {
                    k--;
                    if(Math.abs(sum-target)<miniSum) {
                        miniSum=Math.abs(sum-target);
                        res=sum;
                    }
                }
                else if(sum<target) {
                    j++;
                    if(Math.abs(sum-target)<miniSum) {
                        miniSum=Math.abs(sum-target);
                        res=sum;
                    }
                }
                else {
                    miniSum=0;
                    res=sum;
                    j++;
                }

            }
        }
        return res;
    }
}