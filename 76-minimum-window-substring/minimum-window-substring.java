class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        int left=0;
        if(s.equals(t)) {
            return s;
        }
        if(m<n) {
            return "";
        }
        HashMap<Character,Integer> s_count=new HashMap<>();
        HashMap<Character,Integer> t_count=new HashMap<>();
        for(int i=0;i<n;i++) {
            t_count.put(t.charAt(i),t_count.getOrDefault(t.charAt(i),0)+1);
        }
        int required=t_count.size();
        int formed=0;
        int minLength=Integer.MAX_VALUE;
        String minWinSubString="";
        for(int right=0;right<m;right++) {
            char ch=s.charAt(right);
            s_count.put(ch,s_count.getOrDefault(ch,0)+1);
            if(t_count.containsKey(ch) && t_count.get(ch).intValue()==s_count.get(ch).intValue()) {
                formed++;
            }
            while(formed==required) {
                if(right-left+1<minLength) {
                    minLength=right-left+1;
                    minWinSubString=s.substring(left,right+1);
                }
                char leftChar=s.charAt(left);
                s_count.put(leftChar,s_count.get(leftChar)-1);
                if(t_count.containsKey(leftChar) && s_count.get(leftChar).intValue()<t_count.get(leftChar).intValue()) {
                    formed--;
                }
                if(s_count.get(leftChar)==0) {
                    s_count.remove(leftChar);
                }
                left++;
            }
        }
        return minWinSubString;
    }
}
               
        
