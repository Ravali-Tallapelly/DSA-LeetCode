class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') {
                st.add(ch);
            }
            else if(ch==')' && !st.isEmpty()) {
                if(st.peek()=='(') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
            else if(ch=='}' && !st.isEmpty()) {
                if(st.peek()=='{') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
            else if(ch==']' && !st.isEmpty()) {
                if(st.peek()=='[') {
                    st.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

        }
        if(st.isEmpty()==true) {
            return true;
        }
        return false;
    }
}