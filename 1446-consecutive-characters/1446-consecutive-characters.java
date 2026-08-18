class Solution {
    public int maxPower(String s) {
        if(s.length()==1)return 1;
        int max=0;
        for(int i=1;i<s.length();i++){
            int length=1;
            while(i<s.length()&&s.charAt(i-1)==s.charAt(i)){
                length++;
                i++;
            }
            max=Math.max(max,length);
        }
        return max;
    }
}