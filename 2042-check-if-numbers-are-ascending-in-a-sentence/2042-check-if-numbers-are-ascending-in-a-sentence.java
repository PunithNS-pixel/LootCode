class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                 int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                list.add(num);
            }
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))return false;
        }
    return true;
    }
}