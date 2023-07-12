public class Solution5 {


        public int arrangeCoins(int n) {
            int lo = 1, hi = n, mid;
            while (lo <= hi) {
                mid = lo + (hi - lo) / 2;
                if (mid * (mid + 1L) <= n * 2L) lo = mid + 1;
                else hi = mid - 1;
            }
            return hi;
        }

    public static void main(String[] args) {
        Solution5 s5=new Solution5();
        System.out.println( s5.arrangeCoins(5));
    }
}

