package pl.bartek.majorityElement;

import java.util.Arrays;

/**
 * author: Bartek
 */
public class MajorityElementFinder {

    public int majorityElement(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int half = (nums.length) / 2;
        int candidate = nums[0];
        int length = nums.length;

        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] == candidate) {
                count++;
                if (count > half) {
                    System.out.println(candidate);
                    return candidate;
                }
            } else {
                candidate = nums[i];
                count = 1;
            }
        }
        return 0;
    }
}
