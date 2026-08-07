class Solution {
    public String greatestLetter(String s) {
        char arr[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch : arr) {
            set.add(ch);
        }
        for(char ch='Z';ch>='A';ch--){
            if (set.contains(ch) && set.contains(Character.toLowerCase(ch))) {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}