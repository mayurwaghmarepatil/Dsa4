import java.util.Arrays;

public class Solution8 {

        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[2*n];
            int j=0;
            for(int i=0; i<2*n; i=i+2){
                ans[i] = nums[j];
                ans[i+1] = nums[n+j];
                j++;
            }
            return ans;
        }

    public static void main(String[] args) {
        Solution8 s8=new Solution8();
        System.out.println(Arrays.toString(s8.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }
    }

