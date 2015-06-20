package pl.bartek.ifTwoAreTarget;

/**
 * author: Bartek
 */
class Runner {
    public static void main(String[] args) {

        int target = 0;
        int[] numbers = {-3, 4, 3, 90};

        SumCheck sumCheck = new SumCheck();
        int[] twoSumIndices = sumCheck.twoSum(numbers, target);
        System.out.println("First number's index is: " + twoSumIndices[0]
                + ", and Second number's index is: " + twoSumIndices[1]);

    }
}
