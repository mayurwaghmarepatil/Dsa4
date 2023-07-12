import java.util.Arrays;

public class Solution6 {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++){
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Solution6 s6=new Solution6();
        System.out.println(Arrays.toString(s6.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }


}
