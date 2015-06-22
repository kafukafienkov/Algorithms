package pl.bartek.duplicatesCheck;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 2};

        DuplicatesChecker checker = new DuplicatesChecker();
        boolean ifContainsDuplicates = checker.containsDuplicate(numbers);
        System.out.println(ifContainsDuplicates);
    }
}
