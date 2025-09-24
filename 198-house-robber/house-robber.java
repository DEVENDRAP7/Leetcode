class Solution {
    public int rob(int[] nums) {
        int rob1=0;
        int rob2=0;
        int n=nums.length;
        int total=0;

        for(int i=0;i<n;i++){
            total=Math.max(nums[i]+rob1,rob2);
            rob1=rob2;
            rob2=total;
        }
        return total; 
    }
}