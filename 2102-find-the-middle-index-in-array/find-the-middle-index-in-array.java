class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<n;i++)rightSum+=nums[i];

        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            if(rightSum==leftSum)return i;
            leftSum += nums[i];
        }
        return -1;
    }
}