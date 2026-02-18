class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        var xor = 0
        for n in nums{
            xor ^= n
        }
        return xor
    }
}