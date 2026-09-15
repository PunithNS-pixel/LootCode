class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count<1&&s.charAt(i)!='9'){
                str.append('9');
                count++;
                continue;
            }
            str.append(s.charAt(i));
        }
        int n = Integer.parseInt(str.toString());
        return n;
    }
}