class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int skipfirst[]=new int[n-1];
        int skiplast[] =new int[n-1];
        for(int i=0;i<n-1;i++){
            skipfirst[i] = nums[i+1];
            skiplast[i]= nums[i];
        }
        int res1 = robhelper(skipfirst);
        int res2 = robhelper(skiplast);
        return Math.max(res1,res2);
    }
    public int robhelper(int[] arr){
        int rob1=0;
        int rob2=0;
        int n=arr.length;
        int total=0;

        for(int i=0;i<n;i++){
            total=Math.max(arr[i]+rob1,rob2);
            rob1=rob2;
            rob2=total;
        }
        return total; 
    }
}