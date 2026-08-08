class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>(arr.length/4)){
                max=Math.max(arr[i],max);
            }
        }
        return max;
    }
}