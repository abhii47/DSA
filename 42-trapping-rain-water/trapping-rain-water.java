class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int water = 0;
        int left[] = new int[n];
        int right[] = new int[n];

        //fill left side
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            left[i] = max;
        }

        max=0;
        for(int i =n-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            right[i] = max;
        }

        for(int i=0;i<n;i++){
            water+=Math.min(left[i],right[i])-arr[i];
        }return water;
    }
}