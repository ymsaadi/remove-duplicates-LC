import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        var numSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        int len = numSet.size();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(nums[i])) {
                nums[i] = 101;
            } else {
                numSet.remove(nums[i]);
            }
        }
        Arrays.sort(nums);
        return len;
    }
}
