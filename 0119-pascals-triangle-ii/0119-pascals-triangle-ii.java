class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<Integer> getRow(int rowIndex) {
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }
                else{
                    List<Integer> prev = ans.get(i-1);
                    list.add(prev.get(j)+prev.get(j-1));
                }
            }
            ans.add(list);
        }
        return ans.get(rowIndex);
    }
}