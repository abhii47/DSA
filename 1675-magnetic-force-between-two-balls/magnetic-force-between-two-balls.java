class Solution {
    public boolean engine(int arr[], int mid, int m){
        int count = 1;
        int start = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] - arr[start] >= mid){
                count++;
                start = i;
            }
        }return count >= m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        int low = 0;
        int n = position.length;
        int high = position[n-1] - position[0];
        while(low <= high){
            int mid = (low+high)>>1;
            if(engine(position, mid, m)){
                ans = mid;
                low = mid+1;
            }else high = mid-1;
        }return ans;
    }
}