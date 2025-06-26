class Solution {
    public boolean engine(int piles[],int mid,int h,int n){
        long count=0;
        for(int i=0;i<n;i++){
            count+=(piles[i]+mid-1)/mid;
        }return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low=1;
        int high = piles[0];
        int ans = 0;
        for(int i=0;i<n;i++){
            if(high<piles[i]) high = piles[i];
        }
        while(low<=high){
            int mid = (low+high)>>1;
            if(engine(piles,mid,h,n)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }return ans;
    }
}