class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x, sqrt = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= x) {
                sqrt = (int) mid;
                low = (int) mid + 1;
            }
            else {
                high = (int) mid - 1;
            }
        }
        return sqrt;
    }
}