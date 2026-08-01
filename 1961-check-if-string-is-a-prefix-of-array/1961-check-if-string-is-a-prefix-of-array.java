class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str= new StringBuilder();
        String ans ="";
        for(int i=0;i<words.length;i++){
                        ans+=words[i];
            if(ans.equals(s)){
                return true;
            }

        }
        return false;
    }
}