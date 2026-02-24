class Solution {
    func moveZeroes(_ nums: inout [Int]) {
        var j = 0
        for i in 0..<nums.count {
            if  nums[i] != 0{
                nums.swapAt(i,j)
                j += 1
            }
        }
    }
}