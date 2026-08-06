class Solution {
    public boolean checkString(String s) {
        int i=0;
        if(s.length()==1&&s.charAt(i)=='a')return true;
        while(i < s.length() && s.charAt(i)=='a')i++;
        if(i==s.length())return true;
        int x=i;
        //int count=0;
        for(i=x;i<s.length();i++){
            if(s.charAt(i)=='a')return false;
        }
        return true;
    }
}