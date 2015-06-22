package pl.bartek.duplicatesCheck;

import java.util.Arrays;

/**
 * author: Bartek
 */
public class DuplicatesChecker {

    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0)
            return false;

        int currentNumber;
        int indicesToCheck = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < indicesToCheck; i++) {
            currentNumber = nums[i];
            if (i + 1 >= indicesToCheck)
                return false;
            if (currentNumber == nums[i + 1])
                return true;
        }

        return false;
    }
}


