package pl.bartek.ifTwoAreTarget;

/**
 * author: Bartek
 */
class Runner {
    public static void main(String[] args) {

        int target = 77;
        int[] numbers = {1, 10, 3, 10, 12, 48, 74, 11, 15, 18, 99, 0};

        SumCheck sumCheck = new SumCheck();
        int[] twoSumIndices = sumCheck.twoSum(numbers, target);
        System.out.println("First number's index is: " + twoSumIndices[0]
                + " and Second number's index is: " + twoSumIndices[1]);


    }
}
