class Solution {
    public int climbStairs(int n) {
        int previous2 = 1, previous1 = 2, total=0;
        if(n<3) return n;
        for (int i = 3; i<=n ; i++) {
            total = previous1 + previous2;
            previous2 = previous1;
            previous1 = total; 
        }
        return total;
    }
}
