class Solution {
    public int numRabbits(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            if(map.get(num)>num){
                count+=num+1;
                map.remove(num);
            }
        } 
        for(int rabbit : map.keySet()){
            count+=rabbit+1;
        } return count;
    }
}