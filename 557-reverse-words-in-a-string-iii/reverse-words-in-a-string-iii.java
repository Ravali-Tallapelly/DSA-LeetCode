class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder string;
        for(int i=0;i<arr.length;i++) {
            string = new StringBuilder(arr[i]);
            int left=0;
            int right=string.length()-1;
            while(left<=right) {
                char temp=string.charAt(left);
                string.setCharAt(left,string.charAt(right));
                string.setCharAt(right,temp);
                left++;
                right--;
            }
            arr[i]=string.toString();
        }
        String res="";
        for(int i=0;i<arr.length;i++) {
            res+=arr[i]+" ";
        }
        return res.substring(0,res.length()-1);
    }
}