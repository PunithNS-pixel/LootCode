class Solution {
    public String largestOddNumber(String num) {
        if (num.charAt(num.length() - 1) == '1'||num.charAt(num.length() - 1) == '3'||num.charAt(num.length() - 1) == '5'||num.charAt(num.length() - 1) == '7'||num.charAt(num.length() - 1) == '9')return num;
        /*long n = Long.parseLong(num);
        if(n%2!=0)return num;
        long rem=0;
        long count=0;
        while(n%2==0){
            rem= n/10;
            n=n/10;
            count++;
            if(count==num.length())return "";
        }
        String ans = String.valueOf(rem);
        return ans;*/
        while (num.length()>1&&num.charAt(num.length() - 1) == '2'||num.charAt(num.length() - 1) == '4'||num.charAt(num.length() - 1) == '6'||num.charAt(num.length() - 1) == '8'||num.charAt(num.length() - 1) == '0'){
            num = num.substring(0, num.length() - 1);
            if(num=="")return "";
            if (num.length()>1&&num.charAt(num.length() - 1) == '1'||num.charAt(num.length() - 1) == '3'||num.charAt(num.length() - 1) == '5'||num.charAt(num.length() - 1) == '7'||num.charAt(num.length() - 1) == '9'){return num;}
        }
        if (num.charAt(num.length() - 1) == '1'||num.charAt(num.length() - 1) == '3'||num.charAt(num.length() - 1) == '5'||num.charAt(num.length() - 1) == '7'||num.charAt(num.length() - 1) == '9')return num;
        return "";
    }
}