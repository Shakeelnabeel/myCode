package logic.arrays;          //SUBMITTED 217. LEETCODE

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
