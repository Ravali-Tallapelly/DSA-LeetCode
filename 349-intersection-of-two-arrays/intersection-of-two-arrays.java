class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int p1=0;
        int p2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(p1<n1 && p2<n2) {
            if(nums1[p1]==nums2[p2]) {
                st.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1]<nums2[p2]) {
                p1++;
            }
            else {
                p2++;
            }
        }
        int k=st.size();
        int[] res=new int[k];
        int curr=0;
        for(int num:st) {
            res[curr++]=num;
        }
        return res;
    }
}