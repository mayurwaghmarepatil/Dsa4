public class Solution7 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }

        int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
        for(int[] op : ops) {
            row = Math.min(row, op[0]);
            col = Math.min(col, op[1]);
        }

        return row * col;
    }

    public static void main(String[] args) {
        Solution7 s7=new Solution7();
        System.out.println( s7.maxCount(3,3,new int[][]{{2,2},{3,3}}));
    }

}
