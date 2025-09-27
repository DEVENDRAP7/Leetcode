class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int x : nums){
            if(x == nums[0]) count++;
        }
        return count < nums.length ? 1 : 0;
    }
}