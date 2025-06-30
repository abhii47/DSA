class Solution {
    public boolean canArrange(int[] arr, int k) {
        if(arr.length%2!=0) return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            //-1 ka remainder basic calculator ke according aaye isiliye
            int rem = ((num%k)+k)%k;
            int req = (k-rem)%k;
            if(map.containsKey(req)){
                map.put(req,map.get(req)-1);
                if(map.get(req)==0) map.remove(req);
            }else{
                if(map.containsKey(rem)){
                    map.put(rem,map.get(rem)+1);
                }else{
                    map.put(rem,1);
                }
            }
        }return map.isEmpty();
    }
}