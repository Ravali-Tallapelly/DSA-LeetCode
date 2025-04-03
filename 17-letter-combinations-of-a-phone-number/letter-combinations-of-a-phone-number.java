class Solution {
    public void backtrack(HashMap<Character,String> mp,List<String> res,String digits,StringBuilder curr,int index) {
        if(index==digits.length()) {
            res.add(curr.toString());
            return;
        }
        String characters=mp.get(digits.charAt(index));
        for(char c:characters.toCharArray()) {
            curr.append(c);
            backtrack(mp,res,digits,curr,index+1);
            curr.deleteCharAt(curr.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            return new ArrayList<>();
        }
        HashMap<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        backtrack(mp,res,digits,new StringBuilder(),0);
        return res;
    }
}