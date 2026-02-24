class Solution {
    func isPowerOfTwo(_ n: Int) -> Bool {
        var is2 = false
        if n == 0 {
            return false
        }
        if (n&(n-1)) == 0{
             is2 = true
        }
        return is2
    }
}