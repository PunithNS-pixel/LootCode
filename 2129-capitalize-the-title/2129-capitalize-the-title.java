class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=3){ans.append(Character.toUpperCase(str[i].charAt(0)) +
             str[i].substring(1).toLowerCase()).append(" ");}
            else{
                ans.append(str[i].toLowerCase()).append(" ");
            }
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}