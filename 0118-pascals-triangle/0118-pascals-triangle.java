class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    List<Integer> prev = ans.get(i - 1);
                    list.add(prev.get(j - 1) + prev.get(j));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}