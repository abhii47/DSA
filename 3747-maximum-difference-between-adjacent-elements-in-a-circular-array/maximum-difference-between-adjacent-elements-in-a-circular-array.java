class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len=nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int diff=0;
            if(i==len-1){
                if(nums[i]>nums[0]) diff=nums[i]-nums[0];
                else diff=nums[0]-nums[i]; 
            } 
            else{
                if(nums[i]>nums[i+1]) diff=nums[i]-nums[i+1];
                else diff=nums[i+1]-nums[i];
            }
            if(diff>max) max=diff;
        }return max;
    }
}