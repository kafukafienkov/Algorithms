package pl.bartek.palindromeVerifier;


import org.apache.commons.lang3.StringUtils;

/**
 * author: Bartek
 */
public class Verifier {

    public boolean isPalindrome(String first, String second) {
        if (StringUtils.isEmpty(first) || StringUtils.isEmpty(second)) {
            return false;
        }

        StringBuilder sb = new StringBuilder(second);

        String secondReversed = sb.reverse().toString();
        return first.equals(secondReversed);
    }
}
