class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        Arrays.sort(strs);
        int n=Math.min(strs[0].length(),strs[len-1].length());
        int count=0;
        for(int i=0;i<n;i++) {
            if(strs[0].charAt(i)==strs[len-1].charAt(i)) {
                count++;
            }
            else {
                break;
            }
        }
        return strs[0].substring(0,count);
    }
}