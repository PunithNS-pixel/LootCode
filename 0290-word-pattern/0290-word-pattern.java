class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map1 = new HashMap<>();
        if(pattern.length()!=str.length)return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equals(str[i]))){
                return false;
            }}
            map.put(pattern.charAt(i),str[i]);
            if(map1.containsKey(str[i])){
                if(!(map1.get(str[i]).equals(pattern.charAt(i)))){
                return false;
            }}
            map1.put(str[i],pattern.charAt(i));
        }
        return true;
    }
}