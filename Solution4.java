import java.util.Arrays;

public class Solution4 {

        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            int result = 0;
            for (int i = 0; i < len - 1; i += 2) {
                result += nums[i];
            }
            return result;
        }

    public static void main(String[] args) {
        Solution4 s4=new Solution4();
        System.out.println(s4.arrayPairSum(new int[]{1, 4, 3, 2}));
    }
    }

