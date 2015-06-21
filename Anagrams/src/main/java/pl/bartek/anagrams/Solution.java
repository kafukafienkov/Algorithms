package pl.bartek.anagrams;

import java.util.*;

/**
 * author: Bartek
 */
public class Solution {

    public List<String> anagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return null;

        List<String> solution = new ArrayList<String>();

        Map<String, String> mapOfWords = new HashMap<String, String>();
        for (String checkIfIAmAnagram : strs) {
            char[] stringToBeSorted = checkIfIAmAnagram.toCharArray();
            Arrays.sort(stringToBeSorted);
            String sortedString = new String(stringToBeSorted);
            if (mapOfWords.containsKey(sortedString)) {
                String tempAnagram = mapOfWords.get(sortedString);
                if (tempAnagram.length() == 0 || tempAnagram.charAt(0) != '+') {
                    solution.add(tempAnagram);
                    tempAnagram = "+" + tempAnagram;
                    mapOfWords.put(sortedString, tempAnagram);
                }
                solution.add(checkIfIAmAnagram);
            } else {
                mapOfWords.put(sortedString, checkIfIAmAnagram);
            }
        }

        return solution;
    }
}
