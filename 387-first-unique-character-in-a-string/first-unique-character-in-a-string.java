class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++) {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=-1;
        for(int i=0;i<n;i++) {
            char ch=s.charAt(i);
            if(mp.get(ch)==1) {
                ans=i;
                break;
            }
        }
        return ans;
    }
}