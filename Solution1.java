import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Solution1{
        public List<List<Integer>> findDifference( int[] nums1, int[] nums2) {

            Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            Arrays.stream(nums1).forEach(set2::remove);
            Arrays.stream(nums2).forEach(set1::remove);
            return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
        }

    public static void main(String[] args) {
        Solution1 s1=new Solution1();
        System.out.println( s1.findDifference(new int[]{1,2,3},new int[]{2,4,6}));
    }
    }


