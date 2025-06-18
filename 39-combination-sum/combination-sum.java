class Solution {

    static void engine(int nums[],int sum,int index,List<List<Integer>> list,List<Integer> temp,int target){
        if(sum==target){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target)return;
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            engine(nums,sum+nums[i],i,list,temp,target);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        engine(nums,0,0,list,temp,target);
        return list;
    }
}