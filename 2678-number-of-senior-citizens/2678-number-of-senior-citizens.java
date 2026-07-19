class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            char a = s.charAt(11);
            char b=s.charAt(12);
            int x = (a-'0')*10;
            int y = b-'0';
            int sum=x+y;
            if(sum>60)count++;
        }
        return count;
    }
}