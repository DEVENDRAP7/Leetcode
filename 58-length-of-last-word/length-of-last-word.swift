class Solution {
    func lengthOfLastWord(_ s: String) -> Int {
        var cnt = 0
        var ch = s.split(separator: " ")
        if ch.count > 0{
            let c = ch[(ch.count)-1]
            cnt = c.count 
        }
        return cnt
    }
}