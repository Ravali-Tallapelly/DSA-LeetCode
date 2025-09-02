class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int last=n-1;
        String res="";
        int left=-1;
        for(int right=n-1;right>=0;right--) {
            if(s.charAt(right)!=' ') {
                continue;
            }
            left=right+1;
            while(right>=0 && s.charAt(right)==' ') {
                right--;
            }
            res+=s.substring(left,last+1);
            if(res.length()>0) {
                res+=' ';
            }
            last=right;
        }
        if(last>=0) {
            res+=s.substring(0,last+1)+" ";
        }
        return res.substring(0,res.length()-1);
    }
}