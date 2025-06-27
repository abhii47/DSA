class Solution {
    public boolean engine(int arr[], int mid, int ops){
        long count= 0;
        for(int i = 0; i<arr.length;i++){
            count += (arr[i]+mid-1)/mid -1;
        }return count <= ops;
    }
    public int minimumSize(int[] nums, int ops) {
        int n = nums.length;
        int low = 1;
        int high = nums[0];
        for(int i=0;i<n;i++){
            if(high<nums[i]) high = nums[i];
        }
        int ans =0;
        while(low<=high){
            int mid = (low+high)>>1;
            if(engine(nums,mid,ops)){
                ans = mid;
                high =mid-1;
            }else low = mid+1;
        }return ans;
    }
}