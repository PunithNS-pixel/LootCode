class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String ans[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int index = arr[i].charAt((arr[i].length()-1))-'0'-1;
            ans[index]=arr[i].substring(0,arr[i].length()-1);
        }
        String s1= String.join(" ",ans);
        return s1;
    }
}