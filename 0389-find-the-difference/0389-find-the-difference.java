class Solution {
    public char findTheDifference(String s, String t) {
        char ch =0;
        for(char a:s.toCharArray()){
            ch^=a;
        }
        for(char a:t.toCharArray()){
            ch^=a;
        }
        return ch;
    }
}