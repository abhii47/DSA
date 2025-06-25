class Solution {
    public int maxArea(int[] height) {
        int start =0;
        int end = height.length-1;
        int maxVol = 0;
        int breadth = end;
        while(start<end){
            int length = Math.min(height[start],height[end]);
            int area = length*breadth;
            if(area>maxVol) maxVol = area;
            if(height[start]<height[end]) start++;
            else{
                end--;
            }breadth--;
        }return maxVol;
    }
}