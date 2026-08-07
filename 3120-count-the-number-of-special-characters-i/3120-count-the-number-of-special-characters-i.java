class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch : arr) {
            set.add(ch);
        }
        int count = 0;
        for (char ch : set) {
            if (Character.isLowerCase(ch) &&
                set.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }
        return count;
    }
}