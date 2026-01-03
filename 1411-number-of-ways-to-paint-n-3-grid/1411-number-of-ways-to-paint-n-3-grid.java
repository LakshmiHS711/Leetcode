class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007;

        // dpA -> ABA pattern (2 colors)
        // dpB -> ABC pattern (3 colors)
        long dpA = 6;
        long dpB = 6;

        for (int i = 2; i <= n; i++) {
            long newA = (dpA * 3 + dpB * 2) % mod;
            long newB = (dpA * 2 + dpB * 2) % mod;

            dpA = newA;
            dpB = newB;
        }

        return (int)((dpA + dpB) % mod);
    }
}
