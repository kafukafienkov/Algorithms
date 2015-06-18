package pl.bartek.palindromeVerifier;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        String firstWord = "ajak";
        String secondWord = "kajak";
        Verifier verifier = new Verifier();
        boolean isPalindrome = verifier.isPalindrome(firstWord, secondWord);
        System.out.println("It is " + isPalindrome + " that the two words together make a palindrome");
    }
}
