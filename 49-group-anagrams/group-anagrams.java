class Solution {
    public String sorted(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) { 
        List<List<String>> list = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s:strs){
            String key = sorted(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        for(ArrayList<String> i : map.values()){
            list.add(i);
        }
        return list;
    }
}