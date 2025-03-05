class Solution {
    public int climbStairs(int n) {
         if (n <= 3) return n;
        int a= 2,b=3;
        int cur = 0;
        for (int i = 4; i <= n; i++) {
            cur = a + b;
            a = b;
            b = cur;
        }
        return cur;   
    }
}