class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int l=0,r=0,k=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]<=nums2[r]){
                res[k++]=nums1[l++];
            }
            else{
                res[k++]=nums2[r++];
            }
        }
        while (l < nums1.length) {
            res[k++] = nums1[l++];
        }
        while (r < nums2.length) {   // fixed here
            res[k++] = nums2[r++];
        }
        int n=res.length;
        if(n%2==1){
            return res[n/2];
        }
        else{
            return (res[n/2-1]+res[n/2])/2.0;
        }
    }
}