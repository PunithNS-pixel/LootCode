class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return ans;
    }

    public void backtrack(int start,String s,List<String> temp){
        if(start==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<s.length();i++){
            if(!ispal(s,start,i))continue;

            temp.add(s.substring(start,i+1));
            backtrack(i+1,s,temp);
            temp.remove(temp.size()-1);
        }
    }

    public boolean ispal(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}