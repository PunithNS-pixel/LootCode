class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;
        StringBuilder[] str = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean goingDown = true;
        for (char ch : s.toCharArray()) {
            str[currRow].append(ch);
            if (currRow == 0) {
                goingDown = true;
            } else if (currRow == numRows - 1) {
                goingDown = false;
            }
            currRow += goingDown ? 1 : -1;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(str[i]);
        }
        return ans.toString();
    }
}