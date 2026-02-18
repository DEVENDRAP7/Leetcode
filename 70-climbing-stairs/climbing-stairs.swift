class Solution {
    func climbStairs(_ n: Int) -> Int {
        if n<=3{
            return n
        }
        var a = 1
        var b = 2
        var c = 0
        for _ in 3...n{
            c=a+b
            a=b
            b=c
        }
        return c
    }
}