class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.count==0{
            return 0
        }
        var ct=1
        for i in 1..<nums.count{
            if(nums[i] != nums[i-1]){
                nums[ct] = nums[i]
                ct+=1
            }
        }
        return ct
    }
}