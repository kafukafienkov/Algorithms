package pl.bartek.anagrams;

import java.util.List;

/**
 * author: Bartek
 */
public class Runner {

    public static void main(String[] args) {

        String[] arrayOfStrings = {"KAJAK", "JAKAK", "BILET", "ROSE", "EROS", "PIKSEL", "EKLIPS", "PLEKSI", "NOGA", "AGON", "SPIEK", "SLIPEK"};
        Solution solution = new Solution();
        List<String> foundAnagrams = solution.anagrams(arrayOfStrings);
        System.out.println(foundAnagrams);
    }
}
