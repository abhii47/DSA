class Solution {
    public int largestRectangleArea(int[] arr) {
         Stack<Integer> s = new Stack<>();
         int n = arr.length;
         long right[] = new long[n];
         long left[] = new long[n];

         for(int i = 0; i<n; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) left[i] = -1;
            else{
                left[i] = s.peek();
            }
            s.push(i);
         }
            s.clear();
         for(int i = n-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) right[i] = n;
            else{
                right[i] = s.peek();
            }
            s.push(i);
         }
         long maxArea = 0;
         for(int i = 0; i<n; i++){
            long width = right[i] - left[i] -1;
            long length = arr[i];
            long area = length * width;
            maxArea = Math.max(maxArea, area);
         }
         return (int) maxArea;
    }
}