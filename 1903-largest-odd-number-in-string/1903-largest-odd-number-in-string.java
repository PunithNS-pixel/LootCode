class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==0){
                num=num.substring(0,num.length()-1);
            }
            else{
                return num;
            }
        }
        return "";
    }
}