class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return ans;
        backtrack(0,digits,new StringBuilder());
        return ans;
    }
    
    public void backtrack(int start,String s,StringBuilder temp){
        if(start==s.length()){
            ans.add(temp.toString());
            return;
        }
        int digit = s.charAt(start)-'0';
        String letters=map[digit];
        for(int i=0;i<letters.length();i++){
            temp.append(letters.charAt(i));
            backtrack(start+1,s,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }


}
