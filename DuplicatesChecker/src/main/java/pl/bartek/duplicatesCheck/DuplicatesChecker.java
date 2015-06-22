package pl.bartek.duplicatesCheck;

/**
 * author: Bartek
 */
public class DuplicatesChecker {

    public boolean containsDuplicate(int[] nums) {

        int counter = 0;
        int indicesToCheck = nums.length - 1;

        for (int i = 0; i < indicesToCheck; i++) {
            int currentNumber = nums[i];
            for (int j = indicesToCheck; j > i; j--) {
                if (currentNumber == nums[j])
                    counter++;
                if (counter >= 1)
                    return true;
            }
        }
        return false;
    }
}
