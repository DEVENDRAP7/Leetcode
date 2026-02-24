class Solution {
    func reverseString(_ s: inout [Character]) {
        var c = s.count-1
        for ch in 0..<(s.count)/2 {
            s.swapAt(ch,c)
            c -= 1
       }
    }
}