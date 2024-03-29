package logic.arrays;      //  SUBMITTED 159. LEETCODE

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,2,2,2,2,2,2,1,1};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> check = new HashMap<>();
        Integer integer;
        for (int num : nums) {
            if (!check.containsKey(num)) {
                check.put(num, 1);
            } else {
                integer = check.get(num);
                Integer max = integer + 1;
                check.replace(num, max);
            }

        }
            int count= 0;
            int countVal= 0;
        for (int a : check.keySet()) {
            if (check.get(a) > count) {
                count = check.get(a);
                countVal = a;
            }
        }
        return countVal;
    }
}
