class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int low =1;int high=x;
        int ans = 0;
        while(low<=high){
            int mid = high+(low-high)/2;
            long product = (long)mid*mid;
            if(product == x) return mid;
            if(product<x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }return ans;
    }
}