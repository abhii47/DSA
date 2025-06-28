class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        //1st loop
        for(int i=0;i<n;i++){
            if(nums[i]<=0) nums[i] = n+1;
        }

        //2nd loop
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i])-1;
            if(index>=n)continue;
            if(nums[index]>0) nums[index]*=-1;
        }

        //3rd loop
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}