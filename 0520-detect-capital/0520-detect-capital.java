class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()))
            return true;
        if (word.equals(word.toLowerCase()))
            return true;
        boolean valid = Character.isUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i)) &&
                    !Character.isLowerCase(word.charAt(i))) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}