import java.lang.reflect.Array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3,2,4}, 6);
        System.out.println("["+ints[0]+","+ints[1]+"]");
    }
}
