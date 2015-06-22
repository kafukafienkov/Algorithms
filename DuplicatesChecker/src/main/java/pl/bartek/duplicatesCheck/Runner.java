package pl.bartek.duplicatesCheck;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20, 21};

        DuplicatesChecker checker = new DuplicatesChecker();
        boolean ifContainsDuplicates = checker.containsDuplicate(numbers);
        System.out.println(ifContainsDuplicates);
    }
}
