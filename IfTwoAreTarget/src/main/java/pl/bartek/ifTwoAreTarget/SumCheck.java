package pl.bartek.ifTwoAreTarget;

/**
 * author: Bartek
 */
class SumCheck {

    public int[] twoSum(int[] nums, int target) {

        int arrayLength = nums.length - 1;
        int currentSum;

        for (int firstIndex = 0; firstIndex < arrayLength; firstIndex++) {
            for (int secondIndex = arrayLength; secondIndex > firstIndex; secondIndex--) {
                currentSum = nums[firstIndex] + nums[secondIndex];
                if (currentSum == target) {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }

        return null;
    }
}
