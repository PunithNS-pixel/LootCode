class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!(map.get(s.charAt(i)).equals(t.charAt(i)))){
                return false;
            }}
            map.put(s.charAt(i),t.charAt(i));
            if(map1.containsKey(t.charAt(i))){
                if(!(map1.get(t.charAt(i)).equals(s.charAt(i)))){
                return false;
            }}
            map1.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}