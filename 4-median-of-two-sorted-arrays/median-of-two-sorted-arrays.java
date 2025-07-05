class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int n =n1+n2;
        int arr[] = new int[n];
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        while(p1<n1 && p2<n2){
            if(nums1[p1]<nums2[p2]){
                arr[k++] = nums1[p1++];
            }else{
                arr[k++] = nums2[p2++];
            }
        }
        while(p1<n1){
            arr[k++] = nums1[p1++];
        }
        while(p2<n2){
            arr[k++] = nums2[p2++];
        }
        if((n1+n2)%2!=0){
            return arr[n/2];
        }else{
            return ((arr[n/2])+(arr[n/2-1]))/2.0;
        }
    }
}