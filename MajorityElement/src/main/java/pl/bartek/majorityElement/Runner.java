package pl.bartek.majorityElement;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 3, 3};
        MajorityElementFinder finder = new MajorityElementFinder();
        finder.majorityElement(numbers);
    }
}
