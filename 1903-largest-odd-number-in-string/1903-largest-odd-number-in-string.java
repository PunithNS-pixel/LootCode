class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                return num;
            }
            num=num.substring(0,num.length()-1);
        }
        return "";
    }
}